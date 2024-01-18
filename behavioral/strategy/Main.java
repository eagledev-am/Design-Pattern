package strategy;

public class Main {
    // strategy let you define a family of algorithms for a specified operation
    // and let client  determine which strategy to use in runtime
    // context ( original class ) should have a field to determine strategy
    // strategy interface ( which is implemented by other classes to define strategies )
    public static void main(String[] args) {
        // credit card
        Payment payment = new Payment(new CreditCardStrategy());
        payment.payMoney();

        // paypal
        payment.setStrategy(new PayPalStrategy());
        payment.payMoney();
    }
}