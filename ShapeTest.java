public class ShapeTest {
    public static void main(String[] args) {

        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Square test
        double   w = 5, l = 5;
        Shape Square = new Square(w, l);
        System.out.println("Square width: " + w + " and length: " + l
                + "\nResulting area: " + Square.area()
                + "\nResulting perimeter: " + Square.perimeter() + "\n");
    }
}
