import java.util.List;

public class MathStudent {
    public double calculateTotalArea(List<Shape> shapeList) {
        double totalArea = 0;
        for (Shape shape : shapeList) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
