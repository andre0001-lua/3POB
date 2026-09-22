package _3POB.Exercicios06;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        Circulo circulo = new Circulo();
        circulo.raio = raio;

        System.out.printf("Área: %.2f%n", circulo.calcularArea());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());

        sc.close();
    }
}

class Circulo {
    double raio;

    double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
