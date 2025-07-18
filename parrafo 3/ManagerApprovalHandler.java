public class ManagerApprovalHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        System.out.println("Gerente dando aprobación final: " + request.getMensaje());
    }
}
