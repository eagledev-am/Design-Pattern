package command;

public class TV implements Device{

    @Override
    public void turnOn() {
        System.out.println("Turn on Tv");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off Tv");
    }
}
