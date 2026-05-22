package heranca;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Miau!");
    }

    public static void main(String[] args) {
        Cachorro c = new Cachorro("Rex");
        Gato g = new Gato("Mimi");

        c.emitirSom();
        g.emitirSom();
    }
}