package principal;

import classe_abstrata.Circulo;
import classe_abstrata.Retangulo;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 5);

        System.out.println("Area Circulo: " + c.calcularArea());
        System.out.println("Area Retangulo: " + r.calcularArea());
    }
}