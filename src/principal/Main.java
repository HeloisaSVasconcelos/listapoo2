package principal;

import interfaces.Produto;
import interfaces.Servico;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto(100);
        Servico s = new Servico(100);

        System.out.println("Imposto Produto: " + p.calcularImposto());
        System.out.println("Imposto Servico: " + s.calcularImposto());
    }
}