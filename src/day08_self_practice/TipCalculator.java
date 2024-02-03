package day08_self_practice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to split check?(Yes or No)");
        String split = input.next();
        boolean splitanswer = splitting(split);
        System.out.println("Enter the number of people:");
        int people = input.nextInt();
        System.out.println("Enter the check amount:");
        double checkTotal = input.nextDouble();
        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = input.next();
        double tip = tipcalculation(service);
        double tipTotal = tip * checkTotal;
        billCalculation(splitanswer,people,checkTotal,tipTotal);
        input.close();


    }

    public static boolean splitting(String split) {
        if (split.toLowerCase().equals("yes")) {
            return true;
        } else if (split.toLowerCase().equals("no")) {
            return false;
        } else System.err.println("Please answer Yes or No!");
        return false;
    }

    public static double tipcalculation(String service) {
        if (service.toLowerCase().equals("excellent")) {
            return 0.25;
        } else if (service.toLowerCase().equals("great")) {
            return 0.2;
        } else if (service.toLowerCase().equals("good")) {
            return 0.15;
        } else if (service.toLowerCase().equals("fair")) {
            return 0.1;
        } else if (service.toLowerCase().equals("poor")) {
            return 0.05;
        } else
            System.err.println("Pylease answer Excellent/Great/Good/Fair/Poor");
        return 0;

    }

    public static void billCalculation(Boolean splitanswer, int people, double checkTotal, double tipTotal) {
        double totalPerPerson = 0;
        double tipPerPerson = 0;
        if (splitanswer == true && people > 1) {
            totalPerPerson = checkTotal / people;
            tipPerPerson = tipTotal / people;
            System.out.println("Number of people entered:" + people);
            System.out.println("Total to pay: "+checkTotal);
            System.out.println("Total tip: "+tipTotal);
            System.out.println("Total per person: " + totalPerPerson );
            System.out.println("Tip per person: " + tipPerPerson);
        } else {
            String noSplit = "Order will not be split";
        System.out.println("Number of people entered:" + people);
        System.out.println("Total to pay: "+checkTotal);
        System.out.println("Total tip: "+tipTotal);
        System.out.println(noSplit);
        System.out.println(noSplit);


    }


        }


    }
/*
 Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */