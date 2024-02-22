public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(int request);
}
