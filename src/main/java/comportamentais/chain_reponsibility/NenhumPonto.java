package comportamentais.chain_reponsibility;

public class NenhumPonto implements CalculadorDePontos {
    @Override
    public int calcular(Pedido pedido) {
        return 0;
    }

    @Override
    public CalculadorDePontos setProximo(CalculadorDePontos proximo) {
        throw new UnsupportedOperationException("Operação  não implementada");
    }
}
