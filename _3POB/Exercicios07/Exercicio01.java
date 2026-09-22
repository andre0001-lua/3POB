package _3POB.Exercicios07;

public class Exercicio01 {
    public static void main(String[] args) {

        Produto produtoA = new Produto("Notebook", 3500.00, 10);
        Produto produtoB = new Produto("Mouse", 80.00);

        System.out.println("Produto A:");
        System.out.println("Nome: " + produtoA.getNome());
        System.out.println("Preço: R$ " + produtoA.getPreco());
        System.out.println("Estoque: " + produtoA.getQuantidadeEstoque());
        System.out.println("Valor total em estoque: R$ "
                + produtoA.calcularValorTotalEmEstoque());

        System.out.println("\nProduto B:");
        System.out.println("Nome: " + produtoB.getNome());
        System.out.println("Preço: R$ " + produtoB.getPreco());
        System.out.println("Estoque: " + produtoB.getQuantidadeEstoque());

        System.out.println("\nTentando alterar o preço do Produto A para -10...");
        produtoA.setPreco(-10.0);

        System.out.println("Preço atual: R$ " + produtoA.getPreco());
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
        this.quantidadeEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Quantidade em estoque não pode ser negativa.");
        }
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }
}
