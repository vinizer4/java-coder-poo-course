import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo {
     exports br.com.cod3r.app.calculo;

     requires transitive app.logging;

     exports br.com.cod3r.app.calculo.interno
             to app.financeiro;

     opens br.com.cod3r.app.calculo
             to app.financeiro, app.logging;

     requires app.api;

     provides Calculadora
             with CalculadoraImpl;
 }