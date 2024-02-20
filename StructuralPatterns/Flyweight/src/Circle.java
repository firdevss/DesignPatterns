public class Circle implements Shape{
    private final String color;
    private final int radius;

    public Circle(String color) {
        this.color = color;
        // Assume creating circle is an expensive operation,
        // so we'll just simulate it by sleeping for a while
        try {
            Thread.sleep(100); // Simulate creation time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.radius = 10; // Assume radius is constant for simplicity
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle with radius " + radius + " at (" + x + ", " + y + ")");
    }
}
