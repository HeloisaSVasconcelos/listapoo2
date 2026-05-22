package interfaces;

public class Triatleta implements Nadador, Corredor {
    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }

    @Override
    public void correr() {
        System.out.println("Correndo...");
    }
}