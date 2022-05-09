public class Square extends Shape{
    private final double width, length;

    public Square() {
        this(1,1);
    }
    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return width * length;
    }

}
