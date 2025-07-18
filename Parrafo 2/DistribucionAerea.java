import java.util.List;

public class DistribucionAerea implements EstrategiaDistribucion {
    @Override
    public void transportar(List<Producto> productos, String destino) {
        System.out.println("Distribución Aérea hacia " + destino);
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre());
        }
    }
}
