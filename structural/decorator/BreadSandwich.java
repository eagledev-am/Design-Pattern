package decorator;

public class BreadSandwich implements Sandwich{
    @Override
    public String getDescription() {
        return "Sandwich with ";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
