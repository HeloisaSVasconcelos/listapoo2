package principal;

import interfaces.Imprimivel;
import interfaces.Nota;
import interfaces.Relatorio;

public class Main {

    public static void imprimirDocumento(Imprimivel doc) {
        doc.imprimir();
    }

    public static void main(String[] args) {
        /*
         Chamando o metodo estatico passando objetos diferentes
         que implementam a mesma interface Imprimivel.
         */
        imprimirDocumento(new Nota());
        imprimirDocumento(new Relatorio());
    }
}