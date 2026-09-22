package _3POB.Exercicios09;

public class Exercicio01 {
    public static void main(String[] args) {

        MetodoPagamento cartao =
                new CartaoCredito("1234-5678-9999-0000", 5000);

        MetodoPagamento pix =
                new Pix("12345678900");

        finalizarCompra(cartao, 1200);
        System.out.println();

        finalizarCompra(pix, 800);
    }

    public static void finalizarCompra(
            MetodoPagamento metodo,
            double total) {

        System.out.println("Método: " + metodo.obterDetalhes());
        metodo.processarPagamento(total);
    }
}

interface MetodoPagamento {

    void processarPagamento(double valor);

    String obterDetalhes();
}

class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private double limite;

    public CartaoCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor <= limite) {
            limite -= valor;

            System.out.printf(
                    "Pagamento de R$ %.2f realizado no cartão.%n",
                    valor
            );
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    @Override
    public String obterDetalhes() {
        return "Cartão de Crédito - " + numeroCartao;
    }
}

class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.printf(
                "Pagamento de R$ %.2f realizado via Pix.%n",
                valor
        );
    }

    @Override
    public String obterDetalhes() {
        return "Pix - Chave: " + chavePix;
    }
}
