package comportamentais.observer;

public class Fornecedor implements Observer {

    private String nome;

    private Fornecedor() {
    }

    public Fornecedor novo(String nome) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.nome = nome;
        return fornecedor;
    }

    @Override
    public void update() {
        System.out.println("Fornecedor " + nome + " foi notificado");
    }
}
