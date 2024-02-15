package day14_self_practice.device_task;

public abstract class Device {

    private final String brand,model;
    private double price;
    private String color;
    private final String size;

    private boolean hasBattery,hasPowerButton;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.isBlank()||color.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if(brand.isEmpty()||brand.isBlank()||brand.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.brand = brand;
        if(model.isEmpty()||model.isBlank()||model.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if(size.isEmpty()||size.isBlank()||size.equals(null)){
            throw new RuntimeException("Must not be null or empty!");
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);

    }

    public abstract void turnOn();

    public abstract void turnOff();


    public String toString() {
        return getClass().getSimpleName() +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
Create an Abstract Class Named 'Device':
    - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
    - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

 */