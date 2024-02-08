package comportamentais.visitor;

public class CalcularLucratividade implements Visitor {
    @Override
    public float visitSupermercado(final Supermercado aSupermercado) {
        return aSupermercado.getDepartamentos().stream()
                .map(this::visitDepartamento)
                .reduce(Float.NaN, Float::sum);
    }

    @Override
    public float visitDepartamento(final Departamento aDepartamento) {
        return aDepartamento.getProdutos().stream()
                .map(this::visitProduto)
                .reduce(Float.NaN, Float::sum);
    }

    @Override
    public float visitProduto(final Produto aProduto) {
        return aProduto.getPreco() * aProduto.getMargemLucro() / 100;
    }
}
