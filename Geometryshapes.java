abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class Geometryshapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(3);
        Shape s2 = new Rectangle(4, 5);

        s1.display();
        System.out.println("Circle Area: " + s1.calculateArea());

        s2.display();
        System.out.println("Rectangle Area: " + s2.calculateArea());
    }
}