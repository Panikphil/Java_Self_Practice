package day07_self_practice;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 15.0;
        rectangle1.width = 4.5;
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);

        System.out.println("-----------------");
        Rectangle rectangle2= new Rectangle();
        rectangle2.length = 10;
        rectangle2.width=5;
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        System.out.println(rectangle2);



    }

}
