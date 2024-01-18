package strategy;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("pay using credit card ");
        System.out.println("Amount " + amount);
    }
}
