package day07_self_practice;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Phone";
        item1.unitPrice =800;
        item1.quantity=2;
        item1.calcCost();
        System.out.println(item1);

        System.out.println("------------------");

        Item item2 = new Item();
        item2.itemName ="Headphones";
        item2.unitPrice = 40.5;
        item2.quantity = 3;
        item2.calcCost();
        System.out.println(item2);

    }
}
