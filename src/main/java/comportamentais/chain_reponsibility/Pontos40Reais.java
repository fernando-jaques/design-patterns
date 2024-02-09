package comportamentais.chain_reponsibility;

public class Pontos40Reais implements CalculadorDePontos {

    public static final int QUARENTA_REAIS = 40;
    public static final int OITENTA_REAIS = 80;
    private CalculadorDePontos proximoCalculadorDePontos;

    @Override
    public int calcular(final Pedido aPedido) {
        if (isValorMaiorQue40ReaisEMenorQue80Reais(aPedido))
            return (int) aPedido.getValor() / 2;

        return this.proximoCalculadorDePontos.calcular(aPedido);
    }

    private static boolean isValorMaiorQue40ReaisEMenorQue80Reais(final Pedido aPedido) {
        return isValorMaiorQue40Reais(aPedido) && isValorMenorQue80Reais(aPedido);
    }

    private static boolean isValorMenorQue80Reais(final Pedido aPedido) {
        return aPedido.getValor() < OITENTA_REAIS;
    }

    private static boolean isValorMaiorQue40Reais(final Pedido aPedido) {
        return aPedido.getValor() > QUARENTA_REAIS;
    }

    @Override
    public CalculadorDePontos setProximo(final CalculadorDePontos aProximoCalculadorDePontos) {
        return this.proximoCalculadorDePontos = aProximoCalculadorDePontos;
    }
}
