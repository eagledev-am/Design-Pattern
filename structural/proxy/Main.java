package proxy;

public class Main {
    // proxy is a gateway to an object
    // used to handle access to an object
    // if we want to use a service , we should first call proxy
    // proxy class implements service interface and inject an object from service
    // we do not pass an object of service to proxy
    public static void main(String[] args) {
        DataProxy dataProxy = new DataProxy("Admin" , "1234");
        dataProxy.save();

        DataProxy dataProxy1 = new DataProxy("Admin" , "1234d");
        dataProxy1.save();
    }
}