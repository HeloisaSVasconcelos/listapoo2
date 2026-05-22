package interfaces;

public class Nota implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo nota fiscal...");
    }
}