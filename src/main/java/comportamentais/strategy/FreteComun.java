package comportamentais.strategy;

public class FreteComun implements Frete {
    @Override
    public double calcularPreco(double valor) {
        return valor * 0.05;
    }
}
