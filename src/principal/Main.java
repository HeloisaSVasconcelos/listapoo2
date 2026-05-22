package principal;

import heranca.Aluno;
import heranca.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Joao", 20, "12345");
        Professor p = new Professor("Maria", 40, "Matematica");

        a.apresentar();
        p.apresentar();
    }
}