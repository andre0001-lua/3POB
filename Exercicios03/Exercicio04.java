package _3POB.Exercicios03;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o limite A: ");
        int A = scan.nextInt();

        System.out.print("Digite o limite B: ");
        int B = scan.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = A; i <= B; i++) {

            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scan.close();
    }
}
