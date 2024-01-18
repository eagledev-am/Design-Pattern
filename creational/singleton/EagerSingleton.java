package singleton;

public class EagerSingleton {
    private static EagerSingleton obj = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return obj;
    }

    private EagerSingleton(){

    }
}
