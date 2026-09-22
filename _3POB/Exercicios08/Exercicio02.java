package _3POB.Exercicios08;

public class Exercicio02 {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Funcionario("Carlos", 3000);
        funcionarios[1] = new Gerente("Maria", 5000, 1000);
        funcionarios[2] = new Vendedor("João", 2500, 10000, 5);

        double folhaTotal = 0;

        for (int i = 0; i < funcionarios.length; i++) {
            double salario = funcionarios[i].calcularSalario();

            System.out.printf(
                    "%s - Salário: R$ %.2f%n",
                    funcionarios[i].nome,
                    salario
            );

            folhaTotal += salario;
        }

        System.out.printf("%nFolha total: R$ %.2f%n", folhaTotal);
    }
}

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Funcionario {
    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusFixo;
    }
}

class Vendedor extends Funcionario {
    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(
            String nome,
            double salarioBase,
            double totalVendas,
            double comissaoPercentual) {

        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }

    @Override
    public double calcularSalario() {
        double comissao = totalVendas * comissaoPercentual / 100;

        return salarioBase + comissao;
    }
}
