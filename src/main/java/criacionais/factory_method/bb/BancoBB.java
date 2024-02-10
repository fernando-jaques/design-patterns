package criacionais.factory_method.bb;

import criacionais.factory_method.Banco;
import criacionais.factory_method.Boleto;

public class BancoBB extends Banco {

    @Override
    protected Boleto criarBoleto(int qtdDiasVencimento, float valor) {
        return switch (qtdDiasVencimento) {
            case 10 -> new BoletoBB10Dias(valor);
            case 20 -> new BoletoBB20Dias(valor);
            case 30 -> new BoletoBB30Dias(valor);
            default -> new BoletoBB10Dias(valor);
        };
    }
}
