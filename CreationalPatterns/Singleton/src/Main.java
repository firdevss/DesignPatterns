public class Main {
    public static void main(String[] args) {
        // Getting the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();

        // Trying to get another instance - should return the same instance
        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();

        // Checking if both instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        System.out.println("Singleton Design Pattern");
    }
}