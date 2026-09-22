package _3POB.Exercicios04;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] original = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        int indicePar = 0;
        int indiceImpar = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            original[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 10; i++) {

            if (original[i] % 2 == 0) {
                pares[indicePar] = original[i];
                indicePar++;
            } else {
                impares[indiceImpar] = original[i];
                indiceImpar++;
            }
        }

        
        System.out.println("Números pares:");

        for (int i = 0; i < indicePar; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Números ímpares:");

        for (int i = 0; i < indiceImpar; i++) {
            System.out.println(impares[i]);
        }

        sc.close();
    }
}
