public class CustomerAssistantHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Atención al Cliente manejando solicitud: " + request.getMensaje());
        super.handle(request);
    }
}
