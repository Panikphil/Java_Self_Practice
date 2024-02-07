package day11_self_practice;

public class Pizza {

    String size;
    int numberOfCheeseTopping;
    int numberOfPepperoniTopping;


    public double calcCost(String size, int numberOfPepperoniTopping, int numberOfCheeseTopping) {
        double cost;
        switch (size.toLowerCase()) {

            case "small" -> cost = 10;
            case "medium" -> cost = 12;
            case "large" -> cost = 14;
            default -> {
                System.err.println("Size of the pizza is wrong,please try again");
                cost=0;
                System.exit(1);
            }

        }
        return cost + (numberOfCheeseTopping * 2) + (numberOfPepperoniTopping * 2);
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size.toLowerCase() + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost is: $" + calcCost(size, numberOfPepperoniTopping, numberOfCheeseTopping) +
                '}';


    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
}

/*
Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */