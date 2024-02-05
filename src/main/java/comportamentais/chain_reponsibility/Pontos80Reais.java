package comportamentais.chain_reponsibility;

public class Pontos80Reais implements CalculadorDePontos {

    private CalculadorDePontos proximo;

    @Override
    public int calcular(Pedido pedido) {
        if (pedido.getValor() >= 80)
            return (int) pedido.getValor() / 2;

        return this.proximo.calcular(pedido);
    }

    @Override
    public CalculadorDePontos setProximo(CalculadorDePontos proximo) {
        return this.proximo = proximo;
    }
}
