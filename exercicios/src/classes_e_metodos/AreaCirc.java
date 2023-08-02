package classes_e_metodos;

public class AreaCirc {

    double raio;
    final static double PI = 3.1415;

    public AreaCirc(double raioInicial) {
        this.raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
}
