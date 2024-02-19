public class Singleton {
    // The field for storing the singleton instance should be
    // declared static.
    private static Singleton instance;

    // The singleton's constructor should always be private to
    // prevent direct construction calls with the `new`
    // operator.
    private Singleton() {
        // Initialization code if needed
        System.out.println("Singleton instance created.");
    }

    // The static method that controls access to the singleton
    // instance.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Method specific to the Singleton instance
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }

}
