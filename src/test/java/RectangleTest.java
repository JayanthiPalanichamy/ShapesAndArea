import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    Rectangle rectangle;

    private final double DELTA = 0.0001;

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGiven() {
        rectangle = new Rectangle(4, 5);

        assertEquals(20, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthIsGivenInPointValues() {
        rectangle = new Rectangle(2.5, 4.1);

        assertEquals(10.25, rectangle.calculateArea(), DELTA);
    }


    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthIsGiven() {
        rectangle = new Rectangle(2, 1);

        assertEquals(6, rectangle.calculatePerimeter(), DELTA);
    }

    @Test
    public void shouldReturnAreaWhenSquareSideIsGiven() {
        Rectangle square = Rectangle.createSquare(4);

        assertEquals(16, square.calculateArea(), DELTA);
    }
}
