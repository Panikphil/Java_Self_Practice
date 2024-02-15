package day14_self_practice.device_task;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop computer is turing on by pressing Power button");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop computer is turing off by pressing Power button");
    }
}
