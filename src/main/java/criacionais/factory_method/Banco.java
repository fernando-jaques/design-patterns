package criacionais.factory_method;

public abstract class Banco {

    public Boleto gerarBoleto(int qtdDiasVencimento, float valor) {
        return criarBoleto(qtdDiasVencimento, valor);
    }

    abstract protected Boleto criarBoleto(int qtdDiasVencimento, float valor);
}
