package facade;

public class Main {
    // facade simplified interface for a complex system
    // customer calls the customer service ( to buy order )
    // customer service ( check warehouse packaging , .... )
    // client ---> customer service -> ( check warehouse packaging , .... )
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();

        facade.drawCircle();
        facade.drawRectangle();
        facade.drawTriangle();
    }
}