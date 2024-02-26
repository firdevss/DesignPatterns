import java.util.ArrayList;
import java.util.List;
public class ConcreteMediator implements Mediator{
    private  List<Colleague> colleagues;

    public ConcreteMediator() {
        this.colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague originator) {
        for (Colleague colleague : colleagues) {
            // Send the message to all colleagues except the originator
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}
