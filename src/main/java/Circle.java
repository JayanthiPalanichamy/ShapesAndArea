public class Circle {
    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateRadius() {
        return PI * radius * radius;
    }
}
