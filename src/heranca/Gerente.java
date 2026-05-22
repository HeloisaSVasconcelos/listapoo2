package heranca;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 3000);
        Gerente g = new Gerente("Ana", 8000);

        System.out.println(f.getNome() + " Bônus: " + f.calcularBonus());
        System.out.println(g.getNome() + " Bônus: " + g.calcularBonus());
    }
}