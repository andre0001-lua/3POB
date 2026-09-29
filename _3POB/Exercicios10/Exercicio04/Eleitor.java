package _3POB.Exercicios10.Exercicio04;
 
public class Eleitor {
 
    private String nome;
    private int idade;
 
    public void cadastrar(String nome, int idade) {
        if (idade < 0 || idade > 130) {
            throw new IdadeInvalidaException(
                    "Idade inválida para " + nome + ": " + idade + ". Informe um valor entre 0 e 130.");
        }
        this.nome = nome;
        this.idade = idade;
        System.out.println("Eleitor cadastrado: " + nome + ", " + idade + " anos.");
    }
 
    public String getNome() {
        return nome;
    }
 
    public int getIdade() {
        return idade;
    }
}
 