package day31_inheritance.shape_methodOverriding;

public class Rectangle extends Shape{

    private int length;
    private int wide;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public Rectangle(int length, int wide) {
        setLength(length);
        setWide(wide);
    }

    @Override
    public double area() {
        return length*wide;
    }

    @Override
    public double perimeter() {
        return 2*(wide + length);
    }

    @Override
    public void draw() {
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*****");

    }

}
