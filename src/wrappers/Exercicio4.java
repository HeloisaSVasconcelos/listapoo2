package wrappers;

import java.math.BigDecimal;

public class Exercicio4 {
    public static void main(String[] args) {
        BigDecimal preco = new BigDecimal("49.90");
        BigDecimal qtd = new BigDecimal("3");
        BigDecimal desconto = new BigDecimal("0.95");

        BigDecimal total = preco.multiply(qtd).multiply(desconto);

        // Imprime o total com o desconto aplicado
        System.out.println("Total: R$ " + total);
    }
}