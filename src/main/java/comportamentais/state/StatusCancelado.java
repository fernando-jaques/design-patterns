package comportamentais.state;

public class StatusCancelado implements StatusPedido {

    private Pedido pedido;

    public StatusCancelado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "StatusCancelado{" +
                "pedido=" + pedido +
                '}';
    }
}
