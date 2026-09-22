package _3POB.Exercicios01;

import java.util.Scanner;
 
public class Exercicio05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int segundos = scan.nextInt();


        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos " + minutos);
        System.out.println("Segundos: " + segundosRestantes);
    }
}
