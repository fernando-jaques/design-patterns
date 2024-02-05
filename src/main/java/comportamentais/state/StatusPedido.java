package comportamentais.state;

public interface StatusPedido {

    default void aguardandoPagamento() {
        throw new UnsupportedOperationException("Não é possível voltar para o status Aguardando Pagamento");
    }

    default void pagamentoAprovado() {
        throw new UnsupportedOperationException("Não é possível voltar para o status Pagamento Aprovado");
    }

    default void cancelado() {
        throw new UnsupportedOperationException("Não é possível voltar para o status Cancelado");
    }

    default void enviado() {
        throw new UnsupportedOperationException("Não é possível voltar para o status Enviado");
    }

}
