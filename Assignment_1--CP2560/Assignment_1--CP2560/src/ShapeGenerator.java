import org.w3c.dom.css.Rect;

import java.util.Random;

public class ShapeGenerator{
    Random rand = new Random();
    int number = rand.nextInt(3);



    public Object newShape() {


        if (number == 1){

            //System.out.println(newShape.getDescription());
            Rectangle rectangle = new Rectangle(rand.nextInt(11), rand.nextInt(11));
            return rectangle.getDescription();
        } else {
            Circle circle = new Circle(rand.nextInt(11));
            return circle.getDescription();

        }

    }
}
