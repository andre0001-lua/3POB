package _3POB.Exercicios02;

import java.util.Scanner;

public class Exercicio04{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scan.nextInt();

        System.out.print("Digite o segundo número:  ");
        int numero2 = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scan.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é : " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("O maior número é: " + numero3);
        }

        scan.close();
    }
}
