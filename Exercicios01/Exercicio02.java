import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a temperatura em Celsius: ");
        double tempC = scan.nextDouble();

        double fahrenheit = (tempC * 1.8) + 32; 

        int resultado = (int) fahrenheit;

        System.out.println("A temperatura em Fahrenheit é: " + resultado);
        scan.close();

    }
}