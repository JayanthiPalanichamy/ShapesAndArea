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

    @Test
    public void shouldReturnSixteenWhenSideIsFour() {
        square = new Square(4);

        assertEquals(16, square.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnZeroAsPerimeterWhenSideIsZero() {
        square = new Square(0);

        assertEquals(0, square.calculatePerimeter(), DELTA);
    }

    @Test
    public void shouldReturnFourAsPerimeterWhenSideIsTwo() {
        square = new Square(2);

        assertEquals(8, square.calculatePerimeter(), DELTA);
    }
}