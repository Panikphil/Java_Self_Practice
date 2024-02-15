package day14_self_practice.device_task;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println(getClass().getSimpleName() + " "+getModel()+ " is calling to "+phoneNum);

    }
    public void text(long phoneNum){
        System.out.println(getClass().getSimpleName() + " "+getModel()+ " is texting to "+phoneNum);
    }

    @Override
    public String toString() {
        return "Phone{} " + super.toString();
    }
}

