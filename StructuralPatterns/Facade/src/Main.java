/*
We have three subsystem classes: Engine, Lights, and AirConditioner, which represent different functionalities of a car.
We have a CarFacade class that provides a simplified interface to start and stop the car. It hides the complexities of interacting with the subsystems.
In the FacadePatternExample class, we create an instance of the CarFacade and use it to start and stop the car.
This example demonstrates how the Facade pattern provides a unified interface to a set of interfaces in a subsystem. It promotes loose coupling between clients and subsystems by hiding complex implementation details behind a simple interface.
 */
public class Main {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        // Start the car
        carFacade.startCar();

        // Stop the car
        carFacade.stopCar();

        System.out.println("Facade Design Pattern Example!");
    }
}