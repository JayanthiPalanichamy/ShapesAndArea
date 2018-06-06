import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MathStudentTest {
    MathStudent mathStudent;
    List<Shape> shapeList;

    @Before
    public void setUp() {
        mathStudent = new MathStudent();
    }

    @Test
    public void returnTotalAreaForAllTheShapes() {
        shapeList = Arrays.asList(new Rectangle(1, 1), Rectangle.createSquare(1), new Circle(1), new Parallelogram(1, 1, 1));

        assertEquals(6.14, mathStudent.calculateTotalArea(shapeList), 0.0001);
    }
}
