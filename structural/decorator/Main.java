package decorator;

public class Main {
    // decorator used to add new behaviours for an object
    // implement class of object and inject
    // any new behaviour will extend decorator
    public static void main(String[] args) {
        // cheese sandwich
        Sandwich sandwich = new Cheese(new BreadSandwich());
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getPrice());

        // cheese and catchup
        Sandwich sandwich1 = new Cheese(new Ketchup(new BreadSandwich()));
        System.out.println(sandwich1.getDescription());
        System.out.println(sandwich1.getPrice());
    }
}