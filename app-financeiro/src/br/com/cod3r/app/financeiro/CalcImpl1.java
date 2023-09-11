package br.com.cod3r.app.financeiro;

public class CalcImpl1 implements Calc {

    @Override
    public double soma(double... nums) {
        double total = 0;
        for (double num : nums) {
            total += num;
        }
        return total;
    }
}
