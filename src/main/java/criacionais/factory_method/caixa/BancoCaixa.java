package criacionais.factory_method.caixa;

import criacionais.factory_method.Banco;
import criacionais.factory_method.Boleto;

public class BancoCaixa extends Banco {

    @Override
    protected Boleto criarBoleto(int qtdDiasVencimento, float valor) {
        return switch (qtdDiasVencimento) {
            case 10 -> new BoletoCaixa10Dias(valor);
            case 20 -> new BoletoCaixa20Dias(valor);
            case 30 -> new BoletoCaixa30Dias(valor);
            default -> new BoletoCaixa10Dias(valor);
        };
    }
}
