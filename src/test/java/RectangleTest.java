import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    Rectangle rectangle;
    private final double DELTA = 0.0001;

    @Test
    public void shouldReturnZeroAsAreaWhenLengthAndBreadthAreZero() {
       rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnTwentyWhenLengthIsFourAndBreadthIsFive() {
        rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnAreaForPointValues() {
        rectangle = new Rectangle(2.5, 4.1);
        assertEquals(10.25, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnZeroAsPerimeterWhenLengthAndBreadthAreZero() {
        rectangle = new Rectangle(0,0);
        assertEquals(0,rectangle.calculatePerimeter(),DELTA);
    }

    @Test
    public void shouldReturnThreeWhenLengthIsTwoAndBreadthIsOne() {
        rectangle = new Rectangle(2,1);
        assertEquals(3,rectangle.calculatePerimeter(),DELTA);
    }
}
