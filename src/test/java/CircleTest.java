import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    private final double DELTA = 0.0001;

    @Test
    public void returnZeroAsAreaWhenRadiusIsZero(){
        Circle circle = new Circle(0);

        assertEquals(0,circle.calculateRadius(),DELTA);
    }

    @Test
    public void returnAreaWhenRadiusIsGiven(){
        Circle circle = new Circle(4);

        assertEquals(50.24,circle.calculateRadius(),DELTA);
    }
}
