import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Create an aggregate
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem(1);
        aggregate.addItem(2);
        aggregate.addItem(3);

        // Create an iterator for the aggregate
        Iterator<Integer> iterator = aggregate.createIterator();

        // Iterate over the items
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterator Design Pattern Implementation");
    }
}