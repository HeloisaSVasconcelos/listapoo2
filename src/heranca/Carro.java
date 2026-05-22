package heranca;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano);
        this.numPortas = numPortas;
    }

    public static void main(String[] args) {
        Carro c = new Carro("Toyota", 2022, 4);
        c.ligar();
    }
}