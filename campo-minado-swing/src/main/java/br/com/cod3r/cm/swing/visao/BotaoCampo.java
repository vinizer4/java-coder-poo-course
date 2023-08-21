package br.com.cod3r.cm.swing.visao;

import br.com.cod3r.cm.swing.modelo.Campo;
import br.com.cod3r.cm.swing.modelo.CampoEvento;
import br.com.cod3r.cm.swing.modelo.CampoObservador;

import javax.swing.*;
import java.awt.*;

public class BotaoCampo extends JButton implements CampoObservador {

    private Campo campo;

    private final Color BG_PADRAO = new Color(184, 184, 184);
    private final Color BG_MARCAR = new Color(8, 179, 247);
    private final Color BG_EXPLODIR = new Color(189, 66, 68);
    private final Color TEXTO_VERDE = new Color(0, 100, 0);

    private final Color BG_PADRAO_BORDA = new Color(7, 7, 7);
    private final Color BG_MARCAR_BORDA = new Color(8, 179, 247);
    private final Color BG_EXPLODIR_BORDA = new Color(189, 66, 68);

    public BotaoCampo(Campo campo) {
        this.campo = campo;
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));

        campo.registrarObservador(this);
    }
    
    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch (evento) {
            case ABRIR: 
                aplicarEstiloAbrir();
                break;
            case MARCAR:
                aplicarEstiloMarcar();
                break;
            case EXPLODIR:
                aplicarEstiloExplodir();
                break;
            default:
                aplicarEstiloPadrao();
        }
    }

    private void aplicarEstiloPadrao() {
    }

    private void aplicarEstiloExplodir() {
    }

    private void aplicarEstiloMarcar() {
    }

    private void aplicarEstiloAbrir() {
    }
}
