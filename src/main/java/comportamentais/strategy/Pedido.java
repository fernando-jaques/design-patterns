package comportamentais.strategy;

public class Pedido {
    private double valor;
    private Frete frete;

    public double valorFrete() {
        return this.frete.calcularPreco(this.valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
