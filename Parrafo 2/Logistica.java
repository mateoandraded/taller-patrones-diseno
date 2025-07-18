import java.util.List;

public class Logistica {
    private EstrategiaDistribucion estrategia;

    public void setEstrategia(EstrategiaDistribucion estrategia) {
        this.estrategia = estrategia;
    }

    public void distribuirProductos(List<Producto> productos, String destino) {
        if (estrategia != null) {
            estrategia.transportar(productos, destino);
        } else {
            System.out.println("No se ha configurado una estrategia de distribución.");
        }
    }
}
