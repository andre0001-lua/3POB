package _3POB.Exercicios03;

import java.util.Scanner;

public class Exercicio01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        for (int i= 1; i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scan.close();
    }
}
