package principal;

import classe_abstrata.Carro;
import classe_abstrata.Moto;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Ford");
        Moto m = new Moto("Honda");

        c.buzinar();
        m.buzinar();

        // new Veiculo("X"); -> ERRO nao pode instanciar classe abstrata
    }
}