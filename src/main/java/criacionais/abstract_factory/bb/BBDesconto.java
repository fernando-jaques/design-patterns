package criacionais.abstract_factory.bb;

import criacionais.abstract_factory.Desconto;

public class BBDesconto implements Desconto {
    @Override
    public float getDesconto() {
        return 0.1f;
    }
}
