

public class Rectangle {
    private double breadth;
    private double length;

    public Rectangle(double length, double breadth) {
        if (length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
