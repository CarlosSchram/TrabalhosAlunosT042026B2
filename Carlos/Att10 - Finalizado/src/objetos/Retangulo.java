package objetos;

public class Retangulo {

    double largura;
    double altura;

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void exibirDados() {
        System.out.println("\n--- DADOS DO RETÂNGULO ---");
        System.out.printf("Largura: %.2f\n", largura);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
        System.out.println("---------------------------\n");
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}