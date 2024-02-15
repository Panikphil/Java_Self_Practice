package day14_self_practice.device_task;

public class Samsung extends Phone implements Downloadable,AndroidApps{
    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+getModel()+" is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+getModel()+" is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel()+" is downloading apps from "+ AppStoreName+" for "+OS);
    }
}
