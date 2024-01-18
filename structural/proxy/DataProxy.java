package proxy;

public class DataProxy implements DataSaving{

    private FileSaver saver;
    private boolean isAdmin;

    DataProxy(String username , String password){
        if(username.equals("Admin") && password.equals("1234"))
            isAdmin = true;
    }
    @Override
    public void save() {
        if(isAdmin){
            if(saver == null){
                saver = new FileSaver();
            }
            saver.save();
        }else {
            System.out.println("You can not access ");
        }
    }
}
