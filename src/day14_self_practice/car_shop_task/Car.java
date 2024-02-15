package day14_self_practice.car_shop_task;

public class Car {
    public String modelName;
    public String color;
    public int yearOfManufacturing;
    public int price;

    public Car(String modelName, String color, int yearOfManufacturing, int price) {
        this.modelName = modelName;
        this.color = color;
        this.yearOfManufacturing = yearOfManufacturing;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", yearOfManufacturing=" + yearOfManufacturing +
                ", price=" + price +
                '}';
    }
}
