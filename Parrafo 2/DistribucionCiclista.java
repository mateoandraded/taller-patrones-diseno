import java.util.List;

public class DistribucionCiclista implements EstrategiaDistribucion {
    @Override
    public void transportar(List<Producto> productos, String destino) {
        System.out.println("Distribución Ciclista hacia " + destino);
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre());
        }
    }
}
