package decorator;

public class SandwichDecorator implements Sandwich{

    private Sandwich currentSandwich ;

    public SandwichDecorator(Sandwich sandwich){
        this.currentSandwich = sandwich;
    }

    @Override
    public String getDescription() {
       return currentSandwich.getDescription();
    }

    @Override
    public double getPrice() {
        return currentSandwich.getPrice();
    }
}
