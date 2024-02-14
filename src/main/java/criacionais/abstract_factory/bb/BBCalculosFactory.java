package criacionais.abstract_factory.bb;

import criacionais.abstract_factory.CalculosFactory;
import criacionais.abstract_factory.Desconto;
import criacionais.abstract_factory.Juros;
import criacionais.abstract_factory.Multa;

public class BBCalculosFactory implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new BBJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new BBDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new BBMulta();
    }
}
