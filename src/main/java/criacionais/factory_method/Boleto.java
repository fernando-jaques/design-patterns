package criacionais.factory_method;

public class Boleto {

    protected float valor;
    protected float multa;
    protected float juros;
    protected float desconto;

    public Boleto(float valor) {
        this.valor = valor;
    }

    public float calcularMulta() {
        return this.valor * this.multa;
    }

    public float calcularJuros() {
        return this.valor * this.juros;
    }

    public float calcularDesconto() {
        return this.valor * this.desconto;
    }


}
