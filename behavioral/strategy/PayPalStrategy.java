package strategy;

public class PayPalStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("pay using paypal ");
        System.out.println("Amount " + amount);
    }
}
