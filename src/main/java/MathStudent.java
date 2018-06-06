import java.util.List;

public class MathStudent {
    public double calculateTotalArea(List<Shape> shapeList) {

        return shapeList.stream().mapToDouble(shape -> shape.calculateArea()).sum();
    }
}
