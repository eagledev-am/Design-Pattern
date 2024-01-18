package singleton;

public class ClassicSingleton {
    private static ClassicSingleton obj;

    public static ClassicSingleton getInstance() {
        if (obj == null) {
            obj = new ClassicSingleton();
        }
        return obj;
    }
    private ClassicSingleton(){

    }

}
