package _3POB.Exercicios06;

public class Exercicio04 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Carlos";
        funcionario.cargo = "Programador";
        funcionario.salarioBruto = 3000;

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.printf("Salário antes do aumento: R$ %.2f%n",
                funcionario.salarioBruto);

        funcionario.aplicarAumento(10);

        System.out.printf("Salário após aumento de 10%%: R$ %.2f%n",
                funcionario.salarioBruto);

        System.out.printf("Salário líquido: R$ %.2f%n",
                funcionario.calcularSalarioLiquido(300));
    }
}

class Funcionario {
    String nome;
    String cargo;
    double salarioBruto;

    void aplicarAumento(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    double calcularSalarioLiquido(double descontoImposto) {
        return salarioBruto - descontoImposto;
    }
}
