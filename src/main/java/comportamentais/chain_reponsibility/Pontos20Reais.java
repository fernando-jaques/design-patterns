package comportamentais.chain_reponsibility;

public class Pontos20Reais implements CalculadorDePontos {

    public static final int VINTE_REAIS = 20;
    private CalculadorDePontos proximoCalculadorDePontos;

    private static int getPontuacao(final Pedido aPedido) {
        return (int) aPedido.getValor() / 2;
    }

    private static boolean isPedidoInferiorA20reais(final Pedido aPedido) {
        return aPedido.getValor() <= VINTE_REAIS;
    }

    @Override
    public CalculadorDePontos setProximo(final CalculadorDePontos aProximoCalculadorDePontos) {
        return this.proximoCalculadorDePontos = aProximoCalculadorDePontos;
    }

    @Override
    public int calcular(final Pedido aPedido) {
        if (isPedidoInferiorA20reais(aPedido))
            return getPontuacao(aPedido);

        return this.proximoCalculadorDePontos.calcular(aPedido);
    }


}
