package _3POB.Exercicios10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro (dividendo): ");
            int dividendo = sc.nextInt();

            System.out.print("Digite o segundo número inteiro (divisor): ");
            int divisor = sc.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Digite apenas números inteiros.");
        } finally {
            System.out.println("Operação finalizada.");
            sc.close();
        }
    }
}