package comportamentais.iterator;

import java.util.List;

public class ListaIterator implements Iterator {

    private final List<Object> lista;
    private int index = 0;
    private int size = 0;

    public ListaIterator(List<Object> lista) {

        if (lista == null)
            throw new IllegalArgumentException("Lista não pode ser nula");

        this.size = lista.size();
        this.lista = lista;
    }

    @Override
    public boolean hasNext() {
        return (index < size);
    }

    @Override
    public Object next() {
        return lista.get(index++);
    }
}
