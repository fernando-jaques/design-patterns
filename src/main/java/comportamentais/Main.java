package comportamentais;


import comportamentais.chain_reponsibility.CalculadoraDePontos;
import comportamentais.chain_reponsibility.Pedido;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setValor(100);

        int pontos = CalculadoraDePontos.calcular(pedido);

        System.out.println("Pontos: " + pontos);


    }
}
