package wrappers;

public class Exercicio2 {
    public static void main(String[] args) {
        Integer x = null;

        /* O código abaixo lança NullPointerException.
         Isso ocorre porque o Java tenta fazer o unboxing (converter Integer para int),
         mas o valor é null e tipos primitivos não aceitam null.
         */
        int y = x;
    }
}