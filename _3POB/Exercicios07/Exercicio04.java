package _3POB.Exercicios07;

public class Exercicio04 {
    public static void main(String[] args) {

        Carro carro = new Carro("Civic", 2024);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento());

        System.out.println("\nAcelerando 50 km/h...");
        carro.acelerar(50);

        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento());

        System.out.println("\nFreando 20 km/h...");
        carro.frear(20);

        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");

        System.out.println("\nFreando 100 km/h...");
        carro.frear(100);

        System.out.println("Velocidade: " + carro.getVelocidadeAtual() + " km/h");
        System.out.println("Está em movimento? " + carro.isEmMovimento());
    }
}

class Carro {
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
        }
    }

    public void frear(int decremento) {
        if (decremento > 0) {
            velocidadeAtual -= decremento;

            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }

    public boolean isEmMovimento() {
        return velocidadeAtual > 0;
    }
}
