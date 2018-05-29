public class Rectangle extends Shape {
    private final double breadth;
    private final double length;

    public Rectangle(double length, double breadth) {
        if (length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createSquare(double side) {
        return new Rectangle(side, side);
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
