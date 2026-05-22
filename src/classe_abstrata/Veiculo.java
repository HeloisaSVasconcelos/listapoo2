package classe_abstrata;

public abstract class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public abstract void buzinar();

    public String getMarca() {
        return marca;
    }
}