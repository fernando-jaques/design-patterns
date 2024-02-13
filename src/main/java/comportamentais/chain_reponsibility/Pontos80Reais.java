package comportamentais.chain_reponsibility;

public class Pontos80Reais implements CalculadorDePontos {

    public static final int OUTENTA_REAIS = 80;
    private CalculadorDePontos proximoCalculadorDePontos;

    private static boolean isValorPedidoMaiorQue30Reais(final Pedido aPedido) {
        return aPedido.getValor() >= OUTENTA_REAIS;
    }

    @Override
    public int calcular(final Pedido aPedido) {
        if (isValorPedidoMaiorQue30Reais(aPedido))
            return (int) aPedido.getValor() / 2;

        return this.proximoCalculadorDePontos.calcular(aPedido);
    }

    @Override
    public CalculadorDePontos setProximo(final CalculadorDePontos aProximoCalculadorDePontos) {
        return this.proximoCalculadorDePontos = aProximoCalculadorDePontos;
    }
}
