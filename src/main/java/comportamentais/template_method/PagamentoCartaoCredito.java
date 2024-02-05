package comportamentais.template_method;

public class PagamentoCartaoCredito extends Pagamento {

    @Override
    protected double calcularTaxa() {
        return getValor() * 0.07;
    }
}

