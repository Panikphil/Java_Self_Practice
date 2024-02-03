package day08_self_practice;

import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();
        formatNames(firstName,lastName);
        input.close();

    }

    public static void formatNames(String firstName,String lastName){
        String fistNameLetter =firstName.toUpperCase().substring(0,1);
        String firstNameRest = firstName.toLowerCase().substring(1);
        String lastNameLetter =lastName.toUpperCase().substring(0,1);
        String lastNameRest = lastName.toLowerCase().substring(1);

        System.out.println(fistNameLetter+firstNameRest+" "+lastNameLetter+lastNameRest);

    }


}
/*
 Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */