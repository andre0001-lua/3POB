package _3POB.Exercicios04;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o número que deseja buscar: ");
        int x = sc.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < 6; i++) {
            if (vetor[i] == x) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O número " + x + " foi encontrado.");
            System.out.println("Primeira posição (índice): " + posicao);
        } else {
            System.out.println("O número " + x + " não está presente no vetor.");
        }

        sc.close();
    }
}
