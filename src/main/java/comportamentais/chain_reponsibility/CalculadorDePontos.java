package comportamentais.chain_reponsibility;

public interface CalculadorDePontos {
    int calcular(Pedido pedido);

    CalculadorDePontos setProximo(CalculadorDePontos proximo);
}
