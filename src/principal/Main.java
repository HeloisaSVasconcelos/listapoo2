package principal;

public class Main {
    public static void main(String[] args) {
        Integer x = null;

        /* Da NullPointerException. O Java tenta fazer unboxing
         (converter Integer para int), mas o valor e null.
         Primitivo nao aceita null.
         */
        int y = x;
    }
}