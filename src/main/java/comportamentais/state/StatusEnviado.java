package comportamentais.state;

public class StatusEnviado implements StatusPedido {

    private Pedido pedido;

    public StatusEnviado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "StatusEnviado{" +
                "pedido=" + pedido +
                '}';
    }
}
