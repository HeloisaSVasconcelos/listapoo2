package interfaces;

public class Servico implements Tributavel {
    private double valor;

    public Servico(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularImposto() {
        return valor * 0.06;
    }

    public static void main(String[] args) {
        Produto p = new Produto(100);
        Servico s = new Servico(100);

        System.out.println("Imposto Produto: " + p.calcularImposto());
        System.out.println("Imposto Serviço: " + s.calcularImposto());
    }
}