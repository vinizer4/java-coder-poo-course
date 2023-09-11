package br.com.cod3r.app.financeiro;

import java.util.Arrays;
import java.util.List;

public class SuperHomem implements SuperHeroi {

    @Override
    public List<String> getPoderes() {
        return Arrays.asList("Super força", "Visão de raio X", "Super velocidade");
    }
}
