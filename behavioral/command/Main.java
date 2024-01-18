package command;

public class Main {
    // command send request ( contains all information )
    // sender ( fire a trigger ) -> command
    // receiver
    // interface command ( + execute() ) [ any command will implement the interface ]
    // invoker inject command [ has a reference to command object ]
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        // device
        Device tv = new TV();
        // commands
        Command on = new TurnOn(tv);
        Command off = new TurnOff(tv);

        remoteController.addCommand(1 , on , off);

        remoteController.onKeyPressed(1);
        remoteController.onKeyReleased(1);

        // Media player
        MediaPlayer mediaPlayer = new MediaPlayer();

        Command onMedia = new TurnOn(mediaPlayer);
        Command ofMedia = new TurnOff(mediaPlayer);

        remoteController.addCommand(0 , onMedia , ofMedia);

        remoteController.onKeyPressed(0);
        remoteController.onKeyReleased(0);
    }
}