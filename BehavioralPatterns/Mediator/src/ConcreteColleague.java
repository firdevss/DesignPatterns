public class ConcreteColleague extends Colleague{
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Received message: " + message);
    }
}
