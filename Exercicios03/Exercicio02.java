package _3POB.Exercicios03;

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int soma = 0;

        System.out.println("Digite números inteiros positivos.");
        System.out.println("Digite um número negativo para encerrar.");

        System.out.print("Digite um número: ");
        numero = scan.nextInt();

        while (numero >= 0){
            soma += numero;
            quantidade++;

            System.out.print("Digite outro número: ");
            numero = scan.nextInt();
        }

        System.out.println("\nQuantidade de números: " + quantidade);
        System.out.println("Soma total: " + soma);

        if (quantidade > 0){
            double media = (double) soma / quantidade;
            System.out.println("Média: " + media);
        }else{
            System.out.println("Média: não há números para calcular.");
        }
        scan.close();
    }
}
