package day14_self_practice.car_task;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String colour;

    public Car(String make, String model, int year, double price, String colour) {
        if(make.isEmpty()||make.isBlank()||make.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.make = make;
        if (model.isBlank()||model.isEmpty()||model.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.model = model;
        if (year<1886){
            throw new RuntimeException("Must not be less than 1886!");
        }
        this.year = year;

        setPrice(price);
        setColour(colour);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Must not be less than zero!");
        }
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if(colour.isEmpty()||colour.isBlank()||colour.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.colour = colour;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println("Car " + getMake()+" "+getModel()+" is stopped.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */