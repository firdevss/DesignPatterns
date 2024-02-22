/*
We have a Handler interface defining the methods for setting the next handler and handling requests.
ConcreteHandler1 and ConcreteHandler2 are concrete implementations of the Handler interface. Each handler can handle requests within a specific range and pass the request to the next handler if it can't handle it.
In the Client class, we create instances of concrete handlers and set up the chain by linking them together. Then, we send requests to the first handler in the chain, which will propagate through the chain until a handler handles the request or the end of the chain is reached.
 */
public class Main {
    public static void main(String[] args) {

        // Creating handlers
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        // Setting up the chain
        handler1.setNextHandler(handler2);

        // Sending requests
        handler1.handleRequest(5);  // Request 5 handled by ConcreteHandler1
        handler1.handleRequest(15); // Request 15 handled by ConcreteHandler2
        handler1.handleRequest(25); // No handler can handle the request
        System.out.println("chain of Responsibility Pattern");
    }
}