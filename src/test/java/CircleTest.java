import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    private final double DELTA = 0.0001;
    @Test
    public void returnZeroWhenRadiusIsZero(){
        Circle circle = new Circle(0);

        assertEquals(0,circle.calculateRadius(),DELTA);
    }
}
