public class ConcretePrototype2 implements Prototype{
    private int number;

    public ConcretePrototype2(int number) {
        this.number = number;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this.number);
    }

    @Override
    public void displayInfo() {
        System.out.println("ConcretePrototype2: " + number);
    }
}
