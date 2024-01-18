package observer;

public class Main {
    // observer define a subscription mechanism to
    // notify multiple objects that the state of object changed
    // service -> has subscribers ( should know any updates in service )
    // publisher ( has an array list of subscriber - subscribe - unsubscribe - notifyall methods )
    // interface subscriber ( update method )
    // any subscriber implements subscribe
    public static void main(String[] args) {
        Youtuber youtuber1 = new Youtuber("James");
        Youtuber youtuber2 = new Youtuber("David");

        Subscriber subscriber1 = new Fan("jack");
        Subscriber subscriber2 = new Fan("Thomas");
        Subscriber subscriber3 = new Fan("Joy");
        Subscriber subscriber4 = new Fan("Michael");

        youtuber1.subscribe(subscriber1);
        youtuber1.subscribe(subscriber2);

        youtuber2.subscribe(subscriber3);
        youtuber2.subscribe(subscriber4);

        youtuber1.uploadVideo("Romantic Song");
        youtuber1.uploadVideo("Fifa Gaming");

        youtuber2.uploadVideo("Film trailer");

        youtuber2.unsubscribe(subscriber4);
        youtuber2.uploadVideo("Match summary");
    }
}