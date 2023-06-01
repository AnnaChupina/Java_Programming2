package day31_inheritance.shape_methodOverriding;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public void draw() {
        System.out.println( "   *   ");
        System.out.println( "*     *");
        System.out.println( "   *   ");
    }
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius'" + getRadius() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
