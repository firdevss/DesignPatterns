import java.util.List;

public class ConcreteIterator implements Iterator{
    private List<Integer> items;
    private int position;

    public ConcreteIterator(List<Integer> items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
