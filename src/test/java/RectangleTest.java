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
}
