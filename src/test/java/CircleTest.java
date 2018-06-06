import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    private final double DELTA = 0.0001;
    private Circle circle;

    @Test
    public void returnAreaWhenRadiusIsGiven() {
        circle = new Circle(4);

        assertEquals(50.24, circle.calculateArea(), DELTA);
    }

    @Test
    public void returnPerimeterWhenRadiusIsGiven() {
        circle = new Circle(2);

        assertEquals(12.56, circle.calculatePerimeter(), DELTA);
    }
}
