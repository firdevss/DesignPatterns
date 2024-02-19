/*
The Factory Method Design Pattern is a creational pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. Here's an implementation of the Factory Method Design Pattern in Java
Runnable is the product interface defining the method run().
ConcreteRunnable1 and ConcreteRunnable2 are concrete implementations of the Runnable interface.
RunnableFactory is the creator interface declaring the factory method createRunnable().
ConcreteRunnableFactory1 and ConcreteRunnableFactory2 are concrete implementations of the RunnableFactory interface, providing specific implementations of createRunnable() method to create different types of Runnable objects.
In the client code (Main class), we demonstrate how to use the factory to create Runnable objects without worrying about the specific implementation details.
 */

public class Main {
    public static void main(String[] args) {
        // Create Factory 1
        RunnableFactory factory1 = new ConcreteRunnableFactory1();
        // Create Product 1
        Runnable runnable1 = factory1.createRunnable();
        runnable1.run();

        // Create Factory 2
        RunnableFactory factory2 = new ConcreteRunnableFactory2();
        // Create Product 2
        Runnable runnable2 = factory2.createRunnable();
        runnable2.run();


    }
}