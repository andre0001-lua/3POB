package _3POB.Exercicios10.Exercicio04;

public class Exercicio04 {
 
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};
        int[] idades = {25, -3, 130, 131, 0};
 
        for (int i = 0; i < nomes.length; i++) {
            Eleitor eleitor = new Eleitor();
            try {
                eleitor.cadastrar(nomes[i], idades[i]);
            } catch (IdadeInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
 