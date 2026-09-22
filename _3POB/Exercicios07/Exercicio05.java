package _3POB.Exercicios07;

public class Exercicio05 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Carlos",
                "00123",
                3000.00
        );

        funcionario.exibirDados();

        System.out.println("\nTentando reduzir o salário para R$ 2500,00...");
        funcionario.setSalario(2500.00);

        funcionario.exibirDados();

        System.out.println("\nAumentando o salário para R$ 3500,00...");
        funcionario.setSalario(3500.00);

        funcionario.exibirDados();
    }
}

class Funcionario {
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double novoSalario) {
        if (novoSalario > salario) {
            salario = novoSalario;
        } else {
            System.out.println(
                    "Erro: o novo salário deve ser maior que o salário atual."
            );
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}
