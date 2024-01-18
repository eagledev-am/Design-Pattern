package facade;

import facade.shape.Circle;
import facade.shape.Rectangle;
import facade.shape.Triangle;

public class ShapeFacade{
    private Circle circle;
    private Rectangle rectangle;
    private Triangle triangle;

    public ShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }

    void drawCircle(){
        circle.draw();
    }

    void  drawTriangle(){
        triangle.draw();
    }

    void drawRectangle(){
        rectangle.draw();
    }
}
