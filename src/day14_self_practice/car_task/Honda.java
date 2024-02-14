package day14_self_practice.car_task;

public class Honda extends Car{


    public Honda(String make, String model, int year, double price, String colour) {
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
}
