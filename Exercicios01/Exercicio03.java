import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoINSS = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário Bruto: R$ " + df.format(salarioBruto));
        System.out.println("Salário Líquido: R$ " + df.format(salarioLiquido));

        scanner.close();
    }
}