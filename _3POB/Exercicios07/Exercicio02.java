package _3POB.Exercicios07;

public class Exercicio02 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345", "João");

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());

        conta.consultarSaldo();

        System.out.println("\nDepositando R$ 1000,00...");
        conta.depositar(1000);

        conta.consultarSaldo();

        System.out.println("\nSacando R$ 300,00...");
        conta.sacar(300);

        conta.consultarSaldo();

        System.out.println("\nTentando sacar R$ 1000,00...");
        conta.sacar(1000);

        conta.consultarSaldo();

        System.out.println("\nAlterando titular...");
        conta.setTitular("Maria");

        System.out.println("Novo titular: " + conta.getTitular());
    }
}

class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
