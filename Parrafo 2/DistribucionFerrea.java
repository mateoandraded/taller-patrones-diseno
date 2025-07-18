import java.util.List;

public class DistribucionFerrea implements EstrategiaDistribucion {
    @Override
    public void transportar(List<Producto> productos, String destino) {
        System.out.println("Distribución Ferrea hacia " + destino);
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre());
        }
    }
}
