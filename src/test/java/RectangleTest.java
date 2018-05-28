import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RectangleTest {
    @Test
    public void shouldReturnZeroWhenLengthAndBreadthAreZero() {
       Rectangle rectangle = new Rectangle(0,0);
       assertEquals(0,rectangle.calculateArea());
    }
}
