package comportamentais.iterator;

import java.util.List;

public class MatrizIterator implements Iterator {

    private final List<List<Object>> matriz;
    private int indexRow = 0;
    private int indexColumn = 0;
    private int sizeRow = 0;
    private int sizeColumn = 0;

    public MatrizIterator(List<List<Object>> matriz) {
        if (matriz == null)
            throw new IllegalArgumentException("Matriz não pode ser nula");

        if (matriz.isEmpty())
            throw new IllegalArgumentException("Matriz não pode ser vazia");

        this.sizeRow = matriz.size();
        this.sizeColumn = matriz.getFirst().size();
        this.matriz = matriz;
    }

    @Override
    public boolean hasNext() {
        if (indexColumn >= sizeColumn) {
            indexColumn = 0;
            indexRow++;
        }

        return (indexRow < sizeRow);
    }

    @Override
    public Object next() {
        return matriz.get(indexRow).get(indexColumn++);
    }
}
