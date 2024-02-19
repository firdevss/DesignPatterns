public class ConcretePrototype1 implements Prototype{
    private String name;

    public ConcretePrototype1(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this.name);
    }

    @Override
    public void displayInfo() {
        System.out.println("ConcretePrototype1: " + name);
    }
}
