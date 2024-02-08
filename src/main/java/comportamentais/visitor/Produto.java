package comportamentais.visitor;

public class Produto implements Elemento {

    private String nome;
    private float preco;
    private float margemLucro;

    public Produto(String nome, float preco, float margemLucro) {
        this.nome = nome;
        this.preco = preco;
        this.margemLucro = margemLucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(float margemLucro) {
        this.margemLucro = margemLucro;
    }

    @Override
    public float aceitar(final Visitor visitor) {
        return visitor.visitProduto(this);
    }
}
