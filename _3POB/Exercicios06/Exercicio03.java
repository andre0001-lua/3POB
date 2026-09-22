package _3POB.Exercicios06;

public class Exercicio03 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "João";
        conta.numeroConta = "12345";

        System.out.println("Conta de: " + conta.titular);
        System.out.println("Número da conta: " + conta.numeroConta);

        conta.consultarSaldo();

        System.out.println("\nDepositando R$ 500,00...");
        conta.depositar(500);

        conta.consultarSaldo();

        System.out.println("\nTentando sacar R$ 200,00...");
        conta.sacar(200);

        conta.consultarSaldo();

        System.out.println("\nTentando sacar R$ 500,00...");
        conta.sacar(500);

        System.out.println("\nTentando depositar R$ -100,00...");
        conta.depositar(-100);

        System.out.println("\nSaldo final:");
        conta.consultarSaldo();
    }
}

class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo = 0;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido");
        }
    }

    void consultarSaldo() {
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
