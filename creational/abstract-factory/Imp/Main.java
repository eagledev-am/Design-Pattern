import shapes.Shape;
import shapes.Shapes;

public class Main {
    /**
     * The factory pattern is a creatonal pattern which concern
     * the creation of the object
     * -------------------
     * from the name factory we can treat object as product
     * we do not know how the product was made inside
     * the factory but we use the final state
     * -------------------
     * - it keep the creation of object away from client ( new Object() )
     * - it make maintain easily
     */
    public static void main(String[] args) {
        // create an object of Square
        Shape square = ShapesFactory.getShape(Shapes.SQUARE);
        square.draw();

        // create a rectangle
        Shape rectangle = ShapesFactory.getShape(Shapes.RECTANGLE);
        rectangle.draw();
    }
}