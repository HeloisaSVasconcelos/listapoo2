package principal;

import heranca.Cachorro;
import heranca.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex");
        Gato g = new Gato("Mimi");

        c.emitirSom();
        g.emitirSom();
    }
}