package principal;

import heranca.Funcionario;
import heranca.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Carlos", 3000);
        Gerente g = new Gerente("Ana", 8000);

        System.out.println(f.getNome() + " Bonus: " + f.calcularBonus());
        System.out.println(g.getNome() + " Bonus: " + g.calcularBonus());
    }
}