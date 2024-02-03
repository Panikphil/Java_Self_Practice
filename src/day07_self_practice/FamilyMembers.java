package day07_self_practice;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = input.nextInt();
        if (people < 3 && people >=0 ){
            System.out.println("Live with less than three people.");
        } else if (people <= 6 && people > 0) {
            System.out.println("Live with 3 - 6 people.");
        } else if (people > 6 && people > 0) {
            System.out.println("Live with more than six people.");
        } else
            System.err.println("Amount of people can't be negative!");
        input.close();


    }
}
/*
Create a class named FamilyMembers and write a program that asks the user how many people they live with.

    If the user lives with fewer than three people, print "Live with less than three people."
    If the user lives with 3 - 6 people, print "Live with 3 - 6 people."
    If the user lives with more than six people, print "Live with more than six people."

        Example:
             How many people do you live with?
             Input: 3

        Output:
             Live with less than three people


 */