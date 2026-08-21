package 3POB.Exercicios01;

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

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.print("A media do Aluno é: " + df.format(media));
    sc.close();
    
  }
}
