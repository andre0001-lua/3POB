package _3POB.Exercicios10;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        String[] valores = {"10", "25", "abc", "50"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Vetor: {\"10\", \"25\", \"abc\", \"50\"}");
        int indice = lerIndice(sc);

        try {
            int numero = Integer.parseInt(valores[indice]);
            System.out.println("Valor convertido na posição " + indice + ": " + numero);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: o índice " + indice + " não existe. Use um valor de 0 a "
                    + (valores.length - 1) + ".");
        } catch (NumberFormatException e) {
            System.out.println("Erro: o valor \"" + valores[indice]
                    + "\" na posição " + indice + " não é um número inteiro válido.");
        }

        sc.close();
    }

   
    private static int lerIndice(Scanner sc) {
        while (true) {
            System.out.print("Informe o índice que deseja acessar: ");
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro para o índice.");
            }
        }
    }
}