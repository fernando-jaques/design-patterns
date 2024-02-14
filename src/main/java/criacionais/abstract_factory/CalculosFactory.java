package criacionais.abstract_factory;

public interface CalculosFactory {

    Juros criarJuros();

    Desconto criarDesconto();

    Multa criarMulta();

}
