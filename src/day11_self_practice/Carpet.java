package day11_self_practice;

public class Carpet {

    double width,length, unitPrice;
    boolean isPersian;

    public double calcCost(double width,double length,double unitPrice,boolean isPersian) {
        double cost;
        if (width > 0 && length > 0 && unitPrice > 0) {
            if (isPersian == true) {
                return cost = (width * length) * unitPrice + 200;
            } else {
                return cost = (width * length) * unitPrice;
            }

        }else {
            System.err.println("Carpet size can't be negative");
            return cost = 0;
        }
    }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Carpet total cost is: $" + calcCost(width,length,unitPrice,isPersian) +
                '}';
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
}
/*
Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */