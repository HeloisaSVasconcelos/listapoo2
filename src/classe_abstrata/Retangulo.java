package classe_abstrata;

public class Retangulo extends Forma {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(4, 5);

        System.out.println("Área Circulo: " + c.calcularArea());
        System.out.println("Área Retângulo: " + r.calcularArea());
    }
}