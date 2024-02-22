import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ConcreteAggregate implements Aggregate{
    private List<Integer> items;

    public ConcreteAggregate() {
        items = new ArrayList<>();
    }

    public void addItem(Integer item) {
        items.add(item);
    }

    @Override
    public Iterator<Integer> createIterator() {
        return (Iterator<Integer>) new ConcreteIterator(items);
    }
}
