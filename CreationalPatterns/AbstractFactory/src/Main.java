/*



Abstract Factory is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It's useful when you need to deal with multiple types of objects that belong to a common family and you want to ensure that the created objects are compatible.
 */
public class Main {
    public static void main(String[] args) {
        // Creating car using CarFactory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive(); // Output: Driving a car

        // Creating motorcycle using MotorcycleFactory
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.drive(); // Output: Riding a motorcycle


    }
}