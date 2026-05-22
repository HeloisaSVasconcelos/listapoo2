package wrappers;

public class Exercicio3 {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        // Retorna true devido ao cache do Java para valores de -128 a 127
        System.out.println(a == b);

        Integer c = 200;
        Integer d = 200;
        // Retorna false porque são objetos diferentes na memória
        System.out.println(c == d);
        // Retorna true pois compara o valor interno dos objetos
        System.out.println(c.equals(d));
    }
}