package comportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements Elemento {

    private final List<Produto> produtos;
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(final Produto aProduto) {
        this.produtos.add(aProduto);
    }

    @Override
    public float aceitar(final Visitor visitor) {
        return visitor.visitDepartamento(this);
    }
}
