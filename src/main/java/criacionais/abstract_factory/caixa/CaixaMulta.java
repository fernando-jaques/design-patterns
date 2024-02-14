package criacionais.abstract_factory.caixa;

import criacionais.abstract_factory.Multa;

public class CaixaMulta implements Multa {
    @Override
    public float getMulta() {
        return 0.5f;
    }
}
