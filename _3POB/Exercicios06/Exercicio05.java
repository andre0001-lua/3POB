package _3POB.Exercicios06;

public class Exercicio05 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Maria";
        aluno.matricula = "2025001";
        aluno.nota1 = 8.5;
        aluno.nota2 = 7.5;

        aluno.imprimirBoletim();
    }
}

class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    String verificarAprovacao() {
        if (calcularMedia() > 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    void imprimirBoletim() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Média final: %.2f%n", calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
    }
}
