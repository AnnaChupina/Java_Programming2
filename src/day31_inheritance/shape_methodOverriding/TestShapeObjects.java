package day31_inheritance.shape_methodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("----------------------");

        Circle circle = new Circle(3.50);

        System.out.println( circle);
        circle.draw();

        System.out.println("-----------------");

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);
        rectangle.draw();

    }
}
