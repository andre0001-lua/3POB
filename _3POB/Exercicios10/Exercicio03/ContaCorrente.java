package _3POB.Exercicios10.Exercicio03;

public class ContaCorrente {

    private String numero;
    private double saldo;

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException(String.format(
                    "Saldo insuficiente na conta %s. Saldo: R$ %.2f | Saque solicitado: R$ %.2f",
                    numero, saldo, valor));
        }
        saldo -= valor;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}