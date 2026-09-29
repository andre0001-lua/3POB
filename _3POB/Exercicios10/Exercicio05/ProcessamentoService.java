package _3POB.Exercicios10.Exercicio05;

import java.io.IOException;
 
public class ProcessamentoService {
 
    public int processarArquivo(String caminho) throws ProcessamentoDadosException {
        try {
            String conteudo = lerArquivo(caminho);
            return somarValores(conteudo);
 
        } catch (IOException e) {
            throw new ProcessamentoDadosException(
                    "Não foi possível ler o arquivo informado.", e);
        } catch (NumberFormatException e) {
            throw new ProcessamentoDadosException(
                    "O arquivo \"" + caminho + "\" contém dados em formato inválido.", e);
        }
    }

    private String lerArquivo(String caminho) throws IOException {
        if (caminho == null || caminho.trim().isEmpty()) {
            throw new IOException("Caminho do arquivo nulo ou vazio.");
        }
        if (caminho.contains("invalido")) {
            return "10,abc,30"; // conteúdo corrompido
        }
        return "10,20,30";
    }
 
    private int somarValores(String conteudo) {
        int soma = 0;
        for (String parte : conteudo.split(",")) {
            soma += Integer.parseInt(parte.trim());
        }
        return soma;
    }
}