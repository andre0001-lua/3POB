package 3POB;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio01{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.print("Digite a primeira nota: ");
    double nota1 = scan.nextDouble();
    System.out.print("Digite a segunda nota: ");
    double nota2 = scan.nextDouble();
    System.out.print("Digite a terceira nota: ");
    double nota3 = scan.nextDouble();

    double soma = nota1 + nota 2 + nota 3;
    double media = soma / 3;

    sc.close();
    
  }
}
