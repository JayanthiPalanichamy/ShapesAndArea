import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    @Test
    public void shouldReturnZeroAsAreaWhenLengthAndBreadthAreZero() {
       Rectangle rectangle = new Rectangle(0,0);
       assertEquals(0,rectangle.calculateArea());
    }

    @Test
    public void shouldReturnFourAsAreaWhenLengthAndBreathAreTwo() {
        Rectangle rectangle = new Rectangle(2,2);
        assertEquals(4,rectangle.calculateArea());
    }

    @Test
    public void shouldReturnTwentyWhenLengthIsFourAndBreadthIsFive() {
        Rectangle rectangle = new Rectangle(4,5);
        assertEquals(20,rectangle.calculateArea());
    }
}
