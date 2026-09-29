package _3POB.Exercicios10.Exercicio05;

public class Exercicio05 {
 
    public static void main(String[] args) {
        ProcessamentoService servico = new ProcessamentoService();
        String[] caminhos = {"dados.txt", null, "", "dados_invalido.txt"};
 
        for (String caminho : caminhos) {
            System.out.println("\nProcessando: " + (caminho == null ? "null" : "\"" + caminho + "\""));
            try {
                int soma = servico.processarArquivo(caminho);
                System.out.println("Sucesso. Soma dos valores: " + soma);
            } catch (ProcessamentoDadosException e) {
                System.out.println("Erro: " + e.getMessage());
                if (e.getCause() != null) {
                    System.out.println("Causa raiz: " + e.getCause().getMessage());
                }
            }
        }
    }
}
 