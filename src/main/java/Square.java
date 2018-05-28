public class Square {
    Rectangle equalSideRectangle;

    public Square(double side) {
        equalSideRectangle = new Rectangle(side,side);
    }

    public double calculateArea() {
        return equalSideRectangle.calculateArea();
    }

    public double calculatePerimeter() {
        return 0;
    }
}
