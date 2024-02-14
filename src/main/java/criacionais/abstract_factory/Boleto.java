package criacionais.abstract_factory;

public class Boleto {

    protected float valor;
    protected Multa multa;
    protected Juros juros;
    protected Desconto desconto;

    public Boleto(float valor, CalculosFactory factory) {
        this.valor = valor;
        this.juros = factory.criarJuros();
        this.multa = factory.criarMulta();
        this.desconto = factory.criarDesconto();
    }

    public float calcularJuros() {
        return this.valor * this.juros.getJustos();
    }

    public float calcularMulta() {
        return this.valor * this.multa.getMulta();
    }

    public float calcularDesconto() {
        return this.valor * this.desconto.getDesconto();
    }


}
