package day07_self_practice;

public class Item {

    public String itemName;
    public double unitPrice;
    public int quantity;
    public double totalCost =calcCost();
    public double calcCost(){
        totalCost = unitPrice*quantity;
        return totalCost;
    }


    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }
}
/*
Attributes:
            itemName (String): used for storing the name of the item.
            unitPrice (double): used for storing the quantity of the item.
            quantity (int): used for storing the unit price of the item.

      Actions:
            calcCost(): calculates the total cost of the item.
            toString(): returns a string representation of the Item object with the full information of the item,
            including the total cost calculated by calcCost.
 */