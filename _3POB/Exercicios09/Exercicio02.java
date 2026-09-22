package _3POB.Exercicios09;

public class Exercicio02 {
    public static void main(String[] args) {

        Forma retangulo = new Retangulo("Azul", 5, 3);
        Forma circulo = new Circulo("Vermelho", 4);

        retangulo.exibirCor();
        System.out.printf(
                "Área do retângulo: %.2f%n",
                retangulo.calcularArea()
        );

        System.out.println();

        circulo.exibirCor();
        System.out.printf(
                "Área do círculo: %.2f%n",
                circulo.calcularArea()
        );
    }
}

abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double calcularArea();

    public void exibirCor() {
        System.out.println("Cor da forma: " + cor);
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(
            String cor,
            double largura,
            double altura) {

        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
