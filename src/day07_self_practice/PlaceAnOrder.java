package day07_self_practice;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product name");
        String product = input.nextLine();
        System.out.println("Please enter the price");
        double price = input.nextDouble();
        System.out.println("Please enter the quantity");
        int quantity = input.nextInt();
        System.out.println("Please enter your first name");
        String name = input.next();
        double total = price*quantity;
        System.out.println(name + " your order for "+quantity+" "+product+" has been placed. Your total is "+total);
        input.close();
    }

}
/*
Ask the user to enter the product name (multiple words).
    Ask the user to enter the price (double).
    Ask the user to enter the quantity (int).
    Ask the user to enter their first name (String, single word).

    Print in the following format:

        Example:
             Inputs: "Apples", 1.5, 5, "Luke"

        Output:
             Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */