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
    public void returnTotalAsZeroForAllTheShapesWithZeroArea() {
        shapeList = Arrays.asList(new Rectangle(0, 0), new Square(0), new Circle(0), new Parallelogram(0, 0, 0));


        assertEquals(0, mathStudent.calculateTotalArea(shapeList), 0.0001);
    }

    @Test
    public void returnTotalAsAreaForAllTheShapes() {
        shapeList = Arrays.asList(new Rectangle(1, 1), new Square(1), new Circle(1), new Parallelogram(1, 1, 1));

        assertEquals(6.14, mathStudent.calculateTotalArea(shapeList), 0.0001);
    }
}
