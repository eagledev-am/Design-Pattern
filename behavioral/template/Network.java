package template;

public abstract class Network {
    String userName;
    String password;

    Network(String userName , String password){
        this.userName = userName;
        this.password = password;
    }

    public boolean post(String message){
        if(login(userName , password)){
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }
        return false;
    }

    public abstract boolean login(String userName , String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logout();
}
