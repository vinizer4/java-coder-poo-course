package lambdas;

@FunctionalInterface // opcional mas recomendado para interfaces funcionais (com apenas um método) lambdas
public interface Calculo {

    double executar(double a, double b);
}
