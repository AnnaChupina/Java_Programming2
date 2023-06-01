package day38_exceptions.shapeTask;

public class Circle {
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if(radius<= 0){
            throw new InvalidShapeException("Radius of the circle can nbot be negative or zero: " + radius);
        }
        Radius = radius;
    }
}
