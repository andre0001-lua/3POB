package _3POB.Exercicios10.Exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345-6", 500.00);
        double[] saques = {200.00, 250.00, 100.00};

        for (double valor : saques) {
            try {
                conta.sacar(valor);
                System.out.printf("Saque de R$ %.2f realizado. Saldo atual: R$ %.2f%n",
                        valor, conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}