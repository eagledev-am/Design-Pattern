package observer;

import java.util.ArrayList;
import java.util.List;

public class Youtuber implements publisher{
    private String name;
    private List<Subscriber> subscribers;

    public Youtuber(String name){
        this.name = name;
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String name , String videoName) {
        for(Subscriber subscriber : subscribers){
            subscriber.update(name , videoName);
        }
    }

    void uploadVideo(String videoName){
        notifySubscriber(name , videoName);
    }
}
