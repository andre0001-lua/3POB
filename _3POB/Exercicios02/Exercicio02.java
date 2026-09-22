package _3POB.Exercicios02;

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = scan.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = scan.nextInt();

        int idade = anoAtual - anoNasc;

        System.out.println("Idade: " + idade + " anos");

        if (idade >=18){
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
            }

        scan.close();

    }
}
