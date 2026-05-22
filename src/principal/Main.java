package principal;

import java.util.ArrayList;
import java.util.List;

import classe_abstrata.Forma;
import classe_abstrata.Circulo;
import classe_abstrata.Retangulo;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(5.0));
        formas.add(new Retangulo(4.0, 3.0));
        formas.add(new Circulo(2.5));

        for (Forma f : formas) {
            System.out.println("Area: " + f.calcularArea());
        }
    }
}