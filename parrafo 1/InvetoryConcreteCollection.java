import java.util.List;

public class InventoryConcreteCollection implements InventoryIterableCollection {
    private List<Producto> productos;

    public InventoryConcreteCollection(List<Producto> productos) {
        this.productos = productos;
    }

    public ProductIterator crearIteradorCompradorWeb() {
        return new ProductIteratorCompradorWeb(productos);
    }

    public ProductIterator crearIteradorVendedorTienda() {
        return new ProductIteratorVendedorTienda(productos);
    }

    public ProductIterator crearIteradorProveedor() {
        return new ProductIteratorProveedor(productos);
    }

    public ProductIterator crearIteradorMantenimiento() {
        return new ProductIteratorMantenimiento(productos);
    }
}
