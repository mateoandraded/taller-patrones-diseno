import java.util.List;

public class ProductIteratorMantenimiento implements ProductIterator {
    private List<Producto> productos;
    private int indice;

    public ProductIteratorMantenimiento(List<Producto> productos) {
        this.productos = productos;
        this.indice = 0;
    }

    public boolean hasMore() {
        return indice < productos.size();
    }

    public Producto getNext() {
        if (hasMore()) {
            return productos.get(indice++);
        }
        return null;
    }
}
