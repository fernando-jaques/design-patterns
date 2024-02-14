package criacionais.abstract_factory.bb;

import criacionais.abstract_factory.Juros;

public class BBJuros implements Juros {
    @Override
    public float getJustos() {
        return 0.03f;
    }
}
