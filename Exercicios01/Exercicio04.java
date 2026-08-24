package _3POB.Exercicios01;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Exercicio04{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00");


        System.out.print("Digite a Base: ");
        double base = scan.nextDouble();
        System.out.print("Digite a Altura: ");
        double altura = scan.nextDouble();


        double area = base * altura;
        double perimetro = (2 * (base + altura));

        System.out.println("Área: " + df.format(area));
        System.out.println("Perímetro: " + df.format(perimetro));

    }
}
