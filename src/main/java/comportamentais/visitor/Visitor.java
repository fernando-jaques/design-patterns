package comportamentais.visitor;

public interface Visitor {

    float visitSupermercado(Supermercado aSupermercado);

    float visitDepartamento(Departamento aDepartamento);

    float visitProduto(Produto aProduto);
}
