package criacionais.abstract_factory.caixa;

import criacionais.abstract_factory.Desconto;

public class CaixaDesconto implements Desconto {
    @Override
    public float getDesconto() {
        return 0.1f;
    }
}
