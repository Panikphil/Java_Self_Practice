package day12_self_practice;
public class Circle {

    private double radius;



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Radius can't be negative or equal zero");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea (){
        double area = 3.14*Math.pow(getRadius(),2);
        return area;
    }
    public double calcPerimeter(){
        double perimeter = 2*3.14*getRadius();
        return perimeter;

    }


    public String toString() {
        return "Circle{" +
                " radius=" + getRadius() +
                " area of circle: " + calcArea()+
                " perimeter of circle: " + calcPerimeter()+
                '}';
    }
}
/*
Create a custom class named Circle with the following specifications:

	Attributes:
		radius

	Ensure encapsulation for the field.
		Condition:
			The radius cannot be set to a negative or zero value.

	Add a constructor that allows the user to set the field during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the circle object.
		calcPerimeter(): Calculates and returns the perimeter of the circle object.
		toString(): Displays the radius, area, and perimeter of the circle when the object is printed.

	Create another class named CircleClients, create multiple circle objects, and test each function of the circle object.

 */