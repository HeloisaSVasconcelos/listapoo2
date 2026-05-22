package principal;

import interfaces.Nota;
import interfaces.Relatorio;

public class Main {
    public static void main(String[] args) {
        Nota n = new Nota();
        Relatorio r = new Relatorio();

        n.imprimir();
        r.imprimir();
    }
}