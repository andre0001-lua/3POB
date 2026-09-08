package _3POB.Exercicios03;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Erro: o número deve ser não negativo.");
        } else {
            long fatorial = 1;

            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }

            System.out.println(n + "! = " + fatorial);
        }

        scan.close();
    }
}
