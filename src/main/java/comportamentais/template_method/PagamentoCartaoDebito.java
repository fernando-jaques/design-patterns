package comportamentais.template_method;

public class PagamentoCartaoDebito extends Pagamento {

    @Override
    protected double calcularTaxa() {
        return getValor() * 0.03;
    }

    @Override
    protected double calcularDesconto() {
        return getValor() * 0.05;
    }
}
