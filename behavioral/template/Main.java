package template;

public class Main {
    // template define skeleton algorithm for the superclass
    // that the subclass can override specific steps but keep structure
    // we can use when some classes have similar code
    // Abstract class --> concrete class
    public static void main(String[] args) {
        Network network = new Facebook("Abdo" , "1234");
        network.post("AlAhly fc is the best team in the universe ");

        Network network1 = new Twitter("Abdo" , "1234");
        network1.post("AlAhly fc is the best team in the universe ");
    }
}