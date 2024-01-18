package strategy;

public class Payment {
    private PaymentStrategy strategy;

    Payment(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payMoney(){
        strategy.pay(1000);
    }
}
