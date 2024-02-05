package comportamentais.strategy;

public class FreteExpresso implements Frete {
    @Override
    public double calcularPreco(double valor) {
        return valor * 0.1;
    }
}
