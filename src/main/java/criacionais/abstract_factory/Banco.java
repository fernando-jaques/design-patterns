package criacionais.abstract_factory;

public abstract class Banco {

    public Boleto gerarBoleto(float valor, CalculosFactory factory) {
        return new Boleto(valor, factory);
    }

}
