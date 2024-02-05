package comportamentais.observer;

public class Cliente implements Observer {

    private String nome;

    private Cliente() {
    }

    public Cliente novo(String nome) {
        Cliente cliente = new Cliente();
        cliente.nome = nome;
        return cliente;
    }

    @Override
    public void update() {
        System.out.println("Cliente " + nome + " foi notificado");
    }
}
