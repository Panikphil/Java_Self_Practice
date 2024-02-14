package day14_self_practice.car_task;

public class CydeoCar extends Car implements Flyable{
    public CydeoCar(String make, String model, int year, double price, String colour) {
        super(make, model, year, price, colour);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving");
    }
    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+ " can fly ="+canFly);
        System.out.println("It's flying!");
    }
}
