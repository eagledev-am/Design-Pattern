package singleton;

public class BestSingleton {
    private static BestSingleton obj;
    private BestSingleton(){}

    public static BestSingleton getInstance() {
        if(obj == null){
            synchronized (BestSingleton.class){
                if(obj == null)
                    obj = new BestSingleton();
            }
        }
        return obj;
    }

}
