package org.example.inheritance;

public class ShapeExample {

    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(3);
        shapes[2] = new Rectangle(8, 8);

        // Calculate and print the areas using polymorphism
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
        }
    }
}
