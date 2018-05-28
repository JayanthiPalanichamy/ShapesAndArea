import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    private final double DELTA = 0.0001;
    @Test
    public void shouldReturnZeroAsAreaWhenLengthAndBreadthAreZero() {
       Rectangle rectangle = new Rectangle(0,0);
       assertEquals(0,rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnFourAsAreaWhenLengthAndBreathAreTwo() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(4,rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnTwentyWhenLengthIsFourAndBreadthIsFive() {
        Rectangle rectangle = new Rectangle(4,5);
        assertEquals(20,rectangle.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnAreaForPointValues() {
        Rectangle rectangle = new Rectangle(2.5,4.1);
        assertEquals(10.25,rectangle.calculateArea(),DELTA);
    }
}
