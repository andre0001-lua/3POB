package _3POB.Exercicios08;

public class Exercicio05 {
    public static void main(String[] args) {

        ContaPoupanca poupanca =
                new ContaPoupanca("001", 0.05);

        ContaCorrente corrente =
                new ContaCorrente("002", 1000);

        System.out.println("=== CONTA POUPANÇA ===");

        poupanca.depositar(1000);
        poupanca.sacar(300);
        poupanca.aplicarRendimento();

        System.out.printf(
                "Saldo da poupança: R$ %.2f%n",
                poupanca.getSaldo()
        );

        System.out.println("\n=== CONTA CORRENTE ===");

        corrente.depositar(500);

        System.out.printf(
                "Saldo inicial: R$ %.2f%n",
                corrente.getSaldo()
        );

        corrente.sacar(1200);

        System.out.printf(
                "Saldo após saque: R$ %.2f%n",
                corrente.getSaldo()
        );

        corrente.sacar(400);

        System.out.printf(
                "Saldo final: R$ %.2f%n",
                corrente.getSaldo()
        );
    }
}

class Conta {
    private String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
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
}

class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double taxaRendimento) {
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }
}

class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(
            String numero,
            double limiteChequeEspecial) {

        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + 2.00;

        if (valor > 0
                && saldo - valorComTaxa >= -limiteChequeEspecial) {

            super.sacar(valor);

            saldo -= 2.00;

            System.out.println(
                    "Taxa de R$ 2,00 cobrada pelo saque."
            );
        } else {
            System.out.println(
                    "Saque não permitido. Limite do cheque especial excedido."
            );
        }
    }
}
