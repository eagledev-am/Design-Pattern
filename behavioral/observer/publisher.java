package observer;

public interface publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscriber(String name , String videoName);
}
