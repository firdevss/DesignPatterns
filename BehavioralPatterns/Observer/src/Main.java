public class Main {
    public static void main(String[] args) {

        // Create subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers and attach them to the subject
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);

        // Change the state of the subject
        subject.setState(5);

        // Detach observer1 from the subject
        subject.detach(observer1);

        // Change the state of the subject again
        subject.setState(10);

        System.out.println("Observer Design Pattern Implementation");
    }
}