package _3POB.Exercicios09;

import java.util.ArrayList;
import java.util.List;

public class Exercicio05 {
    public static void main(String[] args) {

        Eletronico eletronico1 =
                new Eletronico(1, 1000);

        Eletronico eletronico2 =
                new Eletronico(2, 2000);

        Alimento alimento =
                new Alimento(3, 50);

        List<Tributavel> itensTributaveis = new ArrayList<>();

        itensTributaveis.add(eletronico1);
        itensTributaveis.add(eletronico2);

        double totalImpostos =
                calcularTotalImpostos(itensTributaveis);

        System.out.printf(
                "Total de impostos: R$ %.2f%n",
                totalImpostos
        );

        System.out.println(
                "Preço do alimento: R$ "
                + alimento.getPrecoBase()
        );
    }

    public static double calcularTotalImpostos(
            List<Tributavel> itensTributaveis) {

        double total = 0;

        for (Tributavel item : itensTributaveis) {
            total += item.calcularTributo();
        }

        return total;
    }
}

interface Tributavel {

    double calcularTributo();
}

abstract class Item {
    protected int codigo;
    protected double precoBase;

    public Item(int codigo, double precoBase) {
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}

class Eletronico extends Item
        implements Tributavel {

    public Eletronico(int codigo, double precoBase) {
        super(codigo, precoBase);
    }

    @Override
    public double calcularTributo() {
        return precoBase * 0.15;
    }
}

class Alimento extends Item {

    public Alimento(int codigo, double precoBase) {
        super(codigo, precoBase);
    }
}
