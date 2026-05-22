package heranca;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("João", 20, "12345");
        Professor p = new Professor("Maria", 40, "Matemática");

        a.apresentar();
        p.apresentar();
    }
}