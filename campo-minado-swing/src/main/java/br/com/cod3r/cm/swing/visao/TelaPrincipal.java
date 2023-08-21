package br.com.cod3r.cm.swing.visao;

import br.com.cod3r.cm.swing.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
        add(new PainelTabuleiro(tabuleiro));


        setTitle("Campo Minado");
        setSize(690, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }

}
