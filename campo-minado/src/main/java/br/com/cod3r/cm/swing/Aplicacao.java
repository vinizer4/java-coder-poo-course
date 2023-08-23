package br.com.cod3r.cm.swing;

import br.com.cod3r.cm.swing.modelo.Tabuleiro;
import br.com.cod3r.cm.swing.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}