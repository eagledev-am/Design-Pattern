import shapes.Rectangle;
import shapes.Shape;
import shapes.Shapes;
import shapes.Square;

public class ShapesFactory {
    public static Shape getShape(Shapes shapes){
        return switch (shapes) {
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
