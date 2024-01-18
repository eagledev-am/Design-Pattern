package command;

public class MediaPlayer implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turn on MediaPlayer");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off MediaPlayer");
    }
}
