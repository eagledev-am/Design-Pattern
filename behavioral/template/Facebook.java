package template;

public class Facebook extends Network{

    Facebook(String userName , String password){
       super(userName , password);
    }
    @Override
    public boolean login(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Username " + this.userName);
        System.out.print("password ");

        for (int i = 0; i < userName.length(); i++) {
            System.out.print('.');
        }
        System.out.println();
        latencyNetwork();
        System.out.println("Login successfully to Facebook !");
        return true;
    }


    @Override
    public boolean sendData(byte[] data) {
        System.out.println("Message " + new String(data) + "was posted in Facebook");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("@"+userName + " logged out");
    }

    private void latencyNetwork() {
        int i = 0;
        while (i<10){

            try {
                System.out.print("*");
                Thread.sleep(500);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
