import java.util.*;

public class Circle{
    private double x;
    private double y;
    public double radius;

    public Circle() {}

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return '"'+"(" + x + "," + y + "," + radius + ")" + '"';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.0 , 4.0, 5.0);
        System.out.println("Circle2: " + circle.toString());
        System.out.println("Area: " + circle.getArea());

    }
}