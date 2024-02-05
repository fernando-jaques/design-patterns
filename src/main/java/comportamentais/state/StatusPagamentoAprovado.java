package comportamentais.state;

public class StatusPagamentoAprovado implements StatusPedido {

    private Pedido pedido;

    public StatusPagamentoAprovado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void enviado() {
        pedido.setStatus(new StatusEnviado(pedido));
    }

    @Override
    public String toString() {
        return "StatusPagamentoAprovado{" +
                "pedido=" + pedido +
                '}';
    }
}
