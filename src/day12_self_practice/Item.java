package day12_self_practice;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        char[] n = name.toCharArray();
        for (char c : n) {
             if(!Character.isLetterOrDigit(c) && !Character.isSpaceChar(c)){
                 System.err.println("SPECIAL CHARACTER NOT ALLOWED");
            System.exit(1);
        }else if(!Character.isLetter(name.charAt(0))) {
                 System.err.println("FIRST LETTER CAN'T BE DIGIT");
                 System.exit(1);
             }
            }
        if (name.isBlank() || name.isEmpty()){
            System.err.println("NOT ALLOWED INPUT");
        System.exit(1);}
            this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0){
            System.err.println("Unit price can't be negative ");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<0){
            System.err.println("Quantity can't be negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public double calcCost(){
       return getQuantity()*getUnitPrice();
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", Total cost: $" + calcCost()+
                '}';
    }
}
/*
Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.
 */