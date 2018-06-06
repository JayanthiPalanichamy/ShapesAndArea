import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    Rectangle square;

    private final double DELTA = 0.0001;


    @Test
    public void shouldReturnAreaWhenSideIsGiven() {
        square =  Rectangle.createSquare(4);

        assertEquals(16, square.calculateArea(), DELTA);
    }

    @Test
    public void shouldReturnPerimeterWhenSideIsGiven() {
        square =  Rectangle.createSquare(2);

        assertEquals(8, square.calculatePerimeter(), DELTA);
    }
}