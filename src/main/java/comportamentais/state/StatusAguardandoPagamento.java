package comportamentais.state;

public class StatusAguardandoPagamento implements StatusPedido {

    private Pedido pedido;

    public StatusAguardandoPagamento(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void pagamentoAprovado() {
        pedido.setStatus(new StatusPagamentoAprovado(pedido));
    }

    @Override
    public void cancelado() {
        pedido.setStatus(new StatusCancelado(pedido));
    }

    @Override
    public String toString() {
        return "StatusAguardandoPagamento{" +
                "pedido=" + pedido +
                '}';
    }
}
