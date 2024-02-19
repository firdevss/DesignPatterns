/*
The Builder design pattern is a creational pattern that allows you to construct complex objects step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
Explanation:

Computer: Represents the product that we want to build, which is a computer with various components.
ComputerBuilder: Defines the methods to build different parts of the computer.
GamingComputerBuilder: A concrete builder implementing the ComputerBuilder interface to build a specific type of computer suitable for gaming.
Technician: The director class responsible for managing the construction process using a builder.
 */
public class Main {
    public static void main(String[] args) {
        Technician technician = new Technician();

        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();

        technician.setComputerBuilder(gamingComputerBuilder);
        technician.constructComputer();

        Computer computer = technician.getComputer();
        System.out.println("Gaming Computer built: " + computer);

        System.out.println("Builder Pattern Example");
    }
}