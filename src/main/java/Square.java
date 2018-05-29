public class Square extends Shape {
    private final Rectangle equalSideRectangle;

    public Square(double side) {
        equalSideRectangle = new Rectangle(side, side);
    }

    public double calculateArea() {
        return equalSideRectangle.calculateArea();
    }

    public double calculatePerimeter() {
        return equalSideRectangle.calculatePerimeter();
    }
}
