public class Parallelogram {
    private final double height;
    private final double base;
    private final double length;

    public Parallelogram(double base, double height, double length) {
        this.base = base;
        this.height = height;
        this.length = length;
    }

    public double calculateArea() {
        return base * height;
    }

    public double calculatePerimeter() {
        return 2 * (base + length);
    }
}
