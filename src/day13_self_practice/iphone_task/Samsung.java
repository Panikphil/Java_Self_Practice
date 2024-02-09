package day13_self_practice.iphone_task;

public class Samsung extends IPhone {

    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    @Override
    void faceTime(String phoneNumber) {
        System.out.println("No such feature");
    }
}
/*
2. Create a class named 'Samsung' with these specifications:
   Attributes:
       - Same as IPhone.

   Encapsulation:
       - Same conditions as IPhone.

   Constructor:
       - Same as IPhone.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - toString(): Prints the information of the Samsung object.

 */