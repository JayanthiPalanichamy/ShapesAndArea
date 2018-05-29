
public class Circle extends Shape {
    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
