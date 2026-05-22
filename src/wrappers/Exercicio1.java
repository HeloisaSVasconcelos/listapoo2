package wrappers;

public class Exercicio1 {
    public static void main(String[] args) {
        int nota = 8;
        Integer notaObj = nota;

        // Imprime as notas
        System.out.println("nota: " + nota);
        System.out.println("notaObj: " + notaObj);
        System.out.println("Tipo: " + notaObj.getClass().getSimpleName());
    }
}