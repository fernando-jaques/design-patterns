package comportamentais.template_method;

public abstract class Pagamento {

    private double valor;
    private Gateway gateway;

    protected double calcularTaxa() {
        return 0;
    }

    ;

    protected double calcularDesconto() {
        return 0;
    }

    public double realizarPagamento() {
        return gateway.cobrar(valor - calcularDesconto() + calcularTaxa());
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
}
