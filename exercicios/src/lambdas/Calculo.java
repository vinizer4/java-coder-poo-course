package lambdas;

@FunctionalInterface // opcional mas recomendado para interfaces funcionais (com apenas um método) lambdas
public interface Calculo {

    double executar(double a, double b);

//    default String legal() {
//        return "legal";
//    } // métodos default são permitidos em interfaces funcionais lambdas

//    static String muitoLegal() {
//        return "muito legal";
//    } // métodos estáticos são permitidos em interfaces funcionais lambdas
}
