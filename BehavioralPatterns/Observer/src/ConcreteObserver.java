public class ConcreteObserver implements Observer{
    private final ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("State updated: " + subject.getState());
    }
}
