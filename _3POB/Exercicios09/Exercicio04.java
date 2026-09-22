package _3POB.Exercicios09;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        ContaCorrente corrente =
                new ContaCorrente("001");

        ContaEmpresarial empresarial =
                new ContaEmpresarial("002");

        corrente.depositar(1000);
        empresarial.depositar(5000);

        contas.add(corrente);
        contas.add(empresarial);

        System.out.println("Saldos antes da cobrança:");

        for (ContaBancaria conta : contas) {
            conta.consultarSaldo();
        }

        System.out.println("\nVirada do mês:");

        for (ContaBancaria conta : contas) {
            conta.cobrarTaxaMensal();
        }

        System.out.println("\nSaldos após a cobrança:");

        for (ContaBancaria conta : contas) {
            conta.consultarSaldo();
        }
    }
}

abstract class ContaBancaria {
    private String numero;
    private double saldo;

    public ContaBancaria(String numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void consultarSaldo() {
        System.out.printf(
                "Conta %s - Saldo: R$ %.2f%n",
                numero,
                saldo
        );
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void retirarTaxa(double valor) {
        saldo -= valor;
    }

    public abstract void cobrarTaxaMensal();
}

class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void cobrarTaxaMensal() {
        retirarTaxa(15.00);

        System.out.println(
                "Taxa de R$ 15,00 cobrada da conta corrente."
        );
    }
}

class ContaEmpresarial extends ContaBancaria {

    public ContaEmpresarial(String numero) {
        super(numero);
    }

    @Override
    public void cobrarTaxaMensal() {
        double taxa = 30.00 + (getSaldo() * 0.005);

        retirarTaxa(taxa);

        System.out.printf(
                "Taxa empresarial de R$ %.2f cobrada.%n",
                taxa
        );
    }
}
