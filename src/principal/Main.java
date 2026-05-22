package principal;

import heranca.Animal;
import heranca.Cachorro;
import heranca.Gato;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex");
        Animal a2 = new Gato("Mimi");
        Animal a3 = new Cachorro("Thor");

        // Executa o metodo do OBJETO REAL, nao da variavel.
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
    }
}