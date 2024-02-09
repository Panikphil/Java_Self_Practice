package day13_self_practice.iphone_task;

public class Nokia extends IPhone{

    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    void faceTime(String phoneNumber) {
        System.out.println("No such feature");
    }
}
/*
3. Create a class named 'Nokia' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Nokia object.
 */