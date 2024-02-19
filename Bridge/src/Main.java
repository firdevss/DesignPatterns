/*
Workshop is the implementor interface defining the methods that concrete implementors must implement.
Assemble and Produce are concrete implementors implementing the Workshop interface.
Vehicle is the abstraction class that contains references to two Workshop objects.
Car and Bike are refined abstractions extending the Vehicle class.
BridgePatternDemo is the main class where the client code is written to demonstrate the usage of the Bridge Design Pattern.

 */
public class Main {

    public static void main(String[] args) {

        Workshop assemble = new Assemble();
        Workshop produce = new Produce();

        Vehicle car = new Car(assemble, produce);
        car.manufacture();

        Vehicle bike = new Bike(assemble, produce);
        bike.manufacture();

        System.out.println("Bridge Design Pattern!");
    }
}