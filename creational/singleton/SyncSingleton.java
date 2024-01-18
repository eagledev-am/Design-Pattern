package singleton;

public class SyncSingleton {

    private static SyncSingleton obj;
    private SyncSingleton(){
    }

    public synchronized static  SyncSingleton getInstance(){
        if(obj == null)
            obj = new SyncSingleton();
        return obj;
    }

}
