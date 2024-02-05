package comportamentais.template_method;

public class PagamentoPIX extends Pagamento {

    @Override
    protected double calcularDesconto() {
        return getValor() * 0.1;
    }
}
