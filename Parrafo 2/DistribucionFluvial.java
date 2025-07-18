import java.util.List;

public class DistribucionFluvial implements EstrategiaDistribucion {
    @Override
    public void transportar(List<Producto> productos, String destino) {
        System.out.println("Distribución Fluvial hacia " + destino);
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre());
        }
    }
}
