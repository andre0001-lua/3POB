package _3POB.Exercicios08;

public class Exercicio04 {
    public static void main(String[] args) {

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0] = new Quadrado(5);
        figuras[1] = new Retangulo(4, 6);
        figuras[2] = new Circulo(3);

        for (int i = 0; i < figuras.length; i++) {
            System.out.printf(
                    "Área da figura %d: %.2f%n",
                    i + 1,
                    figuras[i].calcularArea()
            );
        }
    }
}

class FiguraGeometrica {

    public double calcularArea() {
        return 0.0;
    }
}

class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
