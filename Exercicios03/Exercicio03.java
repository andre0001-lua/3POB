package _3POB.Exercicios03;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int SENHA_CORRETA = 2026;
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != SENHA_CORRETA) {
                System.out.println("Senha Incorreta! Tente novamente.");
            }

        } while (senha != SENHA_CORRETA);

        System.out.println("Acesso Permitido!");

        scan.close();
    }
}
