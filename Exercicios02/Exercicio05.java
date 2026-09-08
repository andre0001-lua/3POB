package _3POB.Exercicios02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o lado A: ");
        double a = scan.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = scan.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = scan.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            if (a == b && b == c){
                System.out.println("Triângulo Equilátero.");
            }else if (a == b || a == c || b == c){
                System.out.println("Triângulo Isósceles.");
            }else{
                System.out.println("Triângulo Escaleno.");
            }
        }else {
            System.out.println("Erro: as medidas não formam um Triângulo válido.");
        }

        scan.close();
    }
}
