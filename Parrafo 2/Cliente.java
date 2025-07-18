import java.util.List;

public class Cliente {
    private Logistica logistica;

    public Cliente() {
        this.logistica = new Logistica();
    }

    public void configurarEstrategia(EstrategiaDistribucion estrategia) {
        logistica.setEstrategia(estrategia);
    }

    public void distribuirProductos(List<Producto> productos, String destino) {
        logistica.distribuirProductos(productos, destino);
    }
}
