package decorator;

public class Cheese extends SandwichDecorator{
    public Cheese(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
       return super.getDescription() + "cheese ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }
}
