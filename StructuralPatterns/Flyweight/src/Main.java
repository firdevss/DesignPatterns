/*he Flyweight design pattern is a structural pattern that is used to minimize memory usage and improve performance by sharing objects that have similar characteristics. In this pattern, instead of creating new objects each time they are needed, objects are reused from a pool if they already exis
Shape is the flyweight interface that defines the method draw().
Circle is a concrete flyweight class that implements the Shape interface. It holds the intrinsic state (color) which is shared among multiple instances.
ShapeFactory is the flyweight factory that manages the flyweight objects. It maintains a pool of flyweight objects and provides an interface to retrieve them. If a flyweight object with a given intrinsic state already exists in the pool, it returns that object; otherwise, it creates a new one and adds it to the pool.
FlyweightPatternExample is the client code that demonstrates how to use the flyweight pattern. It requests flyweight objects (circles) from the factory and draws them at different positions with different colors.
 */
public class Main {
    public static void main(String[] args) {

        // Drawing circles with different colors at different positions
        for (int i = 0; i < 5; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(), getRandomY());
        }
    }

    private static String getRandomColor() {
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }



}