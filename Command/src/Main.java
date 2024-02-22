/*
We have a Command interface with an execute() method.
Light is the receiver of the commands, which has methods to turn the light on and off.
TurnOnCommand and TurnOffCommand are concrete implementations of the Command interface that encapsulate the actions to turn the light on and off, respectively.
RemoteControl is the invoker that holds a list of commands and executes them when needed.
In the Client class, we create instances of the receiver, concrete commands, and invoker. We add commands to the invoker and then execute them using the invoker.
 */
public class Main {
    public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Concrete commands
        Command turnOnCommand = new TurnOnCommand(light);
        Command turnOffCommand = new TurnOffCommand(light);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(turnOnCommand);
        remoteControl.addCommand(turnOffCommand);

        // Execute commands
        remoteControl.executeCommands();
        System.out.println("Command Design Pattern Implementation");
    }
}