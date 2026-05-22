package interfaces;

public class Peixe implements Nadador {
    @Override
    public void nadar() {
        System.out.println("Peixe nadando...");
    }

    public static void main(String[] args) {
        Triatleta t = new Triatleta();
        Peixe p = new Peixe();

        t.nadar();
        t.correr();
        p.nadar();
    }
}