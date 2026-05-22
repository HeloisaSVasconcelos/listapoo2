package heranca;

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println(marca + " ligado!");
    }
}