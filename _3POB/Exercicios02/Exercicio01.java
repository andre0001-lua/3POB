package _3POB.Exercicios02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                DecimalFormat df = new DecimalFormat("#.00");

                System.out.print("Digite o numero: ");
                double num = scan.nextDouble();

                if (num % 2 == 0){
                        System.out.println("O numero é par! ");
                    } else {
                            System.out.println("O numero é impar");
                        }
            }
    }
