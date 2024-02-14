package day14_self_practice.car_task;

public class Tesla extends Car implements AutoPilot{
    public Tesla(String make, String model, int year, double price, String colour) {
        super(make, model, year, price, colour);
    }

    @Override
    public void autopark() {
        System.out.println(getMake()+" "+getModel()+" has Auto park feature ="+ hasAutoPark);
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" has Auto pilot feature ="+ hasAutoPilot);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving");
    }
}
