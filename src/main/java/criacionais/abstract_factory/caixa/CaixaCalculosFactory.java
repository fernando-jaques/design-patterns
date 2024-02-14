package criacionais.abstract_factory.caixa;

import criacionais.abstract_factory.CalculosFactory;
import criacionais.abstract_factory.Desconto;
import criacionais.abstract_factory.Juros;
import criacionais.abstract_factory.Multa;

public class CaixaCalculosFactory implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new CaixaJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new CaixaDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new CaixaMulta();
    }
}
