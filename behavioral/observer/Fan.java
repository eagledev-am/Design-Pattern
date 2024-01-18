package observer;

public class Fan implements Subscriber{
    private String fanName;

    Fan(String fanName){
        this.fanName = fanName;
    }
    @Override
    public void update(String name, String videoName) {
        System.out.println("Hi " + fanName + " The " + name + "has uploaded new video" + "'" + videoName + "'" );
    }
}
