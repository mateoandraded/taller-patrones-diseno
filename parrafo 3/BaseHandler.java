public abstract class BaseHandler implements Handler {
    protected Handler next;

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
