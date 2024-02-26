public class Main {
    public static void main(String[] args) {
        // Create a mediator
        Mediator mediator = new ConcreteMediator();

        // Create colleagues and register them with the mediator
        Colleague colleague1 = new ConcreteColleague(mediator);
        Colleague colleague2 = new ConcreteColleague(mediator);

        ((ConcreteMediator) mediator).addColleague(colleague1);
        ((ConcreteMediator) mediator).addColleague(colleague2);

        // Send a message from one colleague to another
        colleague1.send("Mediator Design Pattern Implementation");


    }
}