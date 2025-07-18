public class TechnicalHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Soporte Técnico revisando solicitud: " + request.getMensaje());
        super.handle(request);
    }
}
