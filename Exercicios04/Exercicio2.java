package _3POB.Exercicios04;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        
        int maior = vetor[0];
        int menor = vetor[0];

        int indiceMaior = 0;
        int indiceMenor = 0;

        
        for (int i = 1; i < 10; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
                indiceMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Índice do maior: " + indiceMaior);

        System.out.println("Menor valor: " + menor);
        System.out.println("Índice do menor: " + indiceMenor);

        sc.close();
    }
}
