package principal;

public class Main {
    public static void main(String[] args) {
        int nota = 8;
        Integer notaObj = nota;

        System.out.println("nota: " + nota);
        System.out.println("notaObj: " + notaObj);
        // Imprime o tipo da variavel
        System.out.println("Tipo: " + notaObj.getClass().getSimpleName());
    }
}