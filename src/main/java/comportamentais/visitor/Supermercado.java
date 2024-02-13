package comportamentais.visitor;

import java.util.ArrayList;
import java.util.List;

public class Supermercado implements Elemento {
    private final List<Departamento> departamentos;
    private String nome;

    public Supermercado(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(final Departamento aDepartamento) {
        this.departamentos.add(aDepartamento);
    }

    @Override
    public float aceitar(final Visitor visitor) {
        return visitor.visitSupermercado(this);
    }
}
