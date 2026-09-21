package _3POB.Exercicios04;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8];
        double soma = 0;

        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            soma += notas[i];
        }

        
        double media = soma / 8;

        System.out.println("Média da turma: " + media);

        System.out.println("Notas acima da média:");

        
        for (int i = 0; i < 8; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }

        sc.close();
    }
}
