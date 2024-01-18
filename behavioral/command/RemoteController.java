package command;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController(){
        onCommands = new Command[3];
        offCommands = new Command[3];
    }

    public void addCommand(int slot , Command onCommand , Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onKeyPressed(int slot){
        onCommands[slot].execute();
    }

    public void onKeyReleased(int slot){
        offCommands[slot].execute();
    }

}
