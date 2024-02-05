package comportamentais.chain_reponsibility;

public class CalculadoraDePontos {

    public static int calcular(Pedido pedido) {

        var pontos20Reais = new Pontos20Reais();
        var pontos40Reais = new Pontos40Reais();
        var pontos80Reais = new Pontos80Reais();
        var nenhumPonto = new NenhumPonto();

        pontos20Reais.setProximo(pontos40Reais);
        pontos40Reais.setProximo(pontos80Reais);
        pontos80Reais.setProximo(nenhumPonto);

        return pontos20Reais.calcular(pedido);
    }
}
