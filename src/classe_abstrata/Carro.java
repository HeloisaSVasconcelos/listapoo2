package classe_abstrata;

public class Carro extends Veiculo {
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void buzinar() {
        System.out.println("BEEEP!");
    }
}