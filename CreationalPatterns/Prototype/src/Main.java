/*
The Prototype pattern is a creational design pattern that allows you to create new objects by copying an existing object, known as the prototype. This pattern is useful when the construction of a new object is more efficient by copying an existing object rather than creating it from scratch.
Prototype: Interface defining the clone method and a method to display information.
ConcretePrototype1 and ConcretePrototype2: Concrete implementations of the Prototype interface. They implement the clone method to create a copy of themselves and display information specific to each object.
PrototypeRegistry: A registry that stores prototype objects. It provides a method to get a specific prototype from the registry and clone it.
 */
public class Main {
    public static void main(String[] args) {

        Prototype prototype1 = PrototypeRegistry.getPrototype("ConcretePrototype1");
        Prototype prototype2 = PrototypeRegistry.getPrototype("ConcretePrototype2");

        prototype1.displayInfo();
        prototype2.displayInfo();
        System.out.println("Prototype Design Pattern!");
    }
}