package day07_self_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents:");
        long cents = input.nextLong();
        long dollars = cents/100;
        long centsEnd = cents-(dollars*100);
        System.out.println(cents+" cents is equal to "+dollars+" dollars and "+centsEnd+" cents");
        input.close();



    }
}
/*
Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents
 */
