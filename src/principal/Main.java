package principal;

import java.util.ArrayList;
import java.util.List;

import heranca.Animal;
import heranca.Cachorro;
import heranca.Gato;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi"));
        animais.add(new Cachorro("Thor"));
        animais.add(new Gato("Luna"));

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}