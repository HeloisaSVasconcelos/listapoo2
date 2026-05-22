package classe_abstrata;

public class Moto extends Veiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void buzinar() {
        System.out.println("BI BI!");
    }

    public static void main(String[] args) {
        Carro c = new Carro("Ford");
        Moto m = new Moto("Honda");

        c.buzinar();
        m.buzinar();

        // Veiculo v = new Veiculo("X"); // Erro: não pode instanciar classe abstrata
    }
}