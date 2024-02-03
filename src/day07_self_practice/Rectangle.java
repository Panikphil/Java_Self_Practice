package day07_self_practice;

public class Rectangle {

    public double width;
    public double length;


    public void calculateArea() {
        double area = width * length;
        System.out.println("Area of rectangle is: " + area);
    }

    public void calculatePerimeter() {
        double perimeter = (2 * width) + (2 * length);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
/*
Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.

 */