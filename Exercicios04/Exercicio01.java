package _3POB.Exercicios04;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        
        System.out.println("Valores na ordem inversa:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(vetor[i]);
        }

        sc.close();
    }
}
