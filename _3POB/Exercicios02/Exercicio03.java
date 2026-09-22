package _3POB.Exercicios02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 7.0){
            System.out.println("Aprovado.");
        } else if (media >= 5 && media < 7.0){
            System.out.println("Em Recuperação.");
        } else{
            System.out.println("Reprovado.");
        }

        scan.close();
    }
}
