import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    Square square;

    private final double DELTA = 0.0001;

    @Test
    public void shouldReturnZeroAsAreaWhenSideIsZero() {
        square = new Square(0);

        assertEquals(0, square.calculateArea(), DELTA);
    }


}
