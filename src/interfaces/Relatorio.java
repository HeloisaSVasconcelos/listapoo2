package interfaces;

public class Relatorio implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo relatorio...");
    }

    public static void main(String[] args) {
        Nota n = new Nota();
        Relatorio r = new Relatorio();

        n.imprimir();
        r.imprimir();
    }
}