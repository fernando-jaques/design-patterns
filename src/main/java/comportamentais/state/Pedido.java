package comportamentais.state;


public class Pedido {

    private StatusPedido status;

    public Pedido() {
        this.status = new StatusAguardandoPagamento(this);
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void pagar() {
        status.pagamentoAprovado();
    }

    public void aprovarPagamento() {
        status.pagamentoAprovado();
    }

    public void enviar() {
        status.enviado();
    }

    public void cancelar() {
        status.cancelado();
    }

}
