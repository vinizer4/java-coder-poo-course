package br.com.cod3r.cm.swing.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos = new ArrayList<>();
    private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarOsVizinhos();
        sortearMinas();
    }

    public void registrarObservador(Consumer<ResultadoEvento> observador) {
        observadores.add(observador);
    }

    private void notificarObservadores(boolean resultado) {
        observadores.stream()
                .forEach(o -> o.accept(new ResultadoEvento(resultado)));
    }

    public void abrir(int linha, int coluna) {
        try {
            campos.parallelStream()
                    .filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
                    .findFirst()
                    .ifPresent(campo -> campo.abrir());
        } catch (Exception e) {
            // FIXME Ajustar a implementacao para que o metodo abrir de um campo
            campos.forEach(campo -> campo.setAberto(true));
            throw e;
        }
    }

    public void alternarMarcacao(int linha, int coluna) {
        campos.parallelStream()
                .filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
                .findFirst()
                .ifPresent(campo -> campo.alternarMarcacao());
    }

    private void gerarCampos() {
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                Campo campo = new Campo(linha, coluna);
                campo.registrarObservador(this);
                campos.add(campo);
            }
        }
    }

    private void associarOsVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = c -> c.isMinado();

        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        } while (minasArmadas < minas);
    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    public void reiniciar() {
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        if (evento == CampoEvento.EXPLODIR) {
            mostrarMinas();
            notificarObservadores(false);
        } else if (objetivoAlcancado()) {
            notificarObservadores(true);
        }
    }

    private void mostrarMinas() {
        campos.stream()
                .filter(campo -> campo.isMinado())
                .filter(campo -> !campo.isMarcado())
                .forEach(campo -> campo.setAberto(true));
    }

}
