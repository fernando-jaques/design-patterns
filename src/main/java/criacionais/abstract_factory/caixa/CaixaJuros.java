package criacionais.abstract_factory.caixa;

import criacionais.abstract_factory.Juros;

public class CaixaJuros implements Juros {
    @Override
    public float getJustos() {
        return 0.02f;
    }
}
