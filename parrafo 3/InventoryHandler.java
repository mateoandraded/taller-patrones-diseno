public class InventoryHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Inventario verificando disponibilidad: " + request.getMensaje());
        super.handle(request);
    }
}
