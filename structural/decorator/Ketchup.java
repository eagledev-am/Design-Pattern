package decorator;

public class Ketchup extends SandwichDecorator{
    public Ketchup(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Ketchup ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2;
    }
}
