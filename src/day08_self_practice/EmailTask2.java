package day08_self_practice;

import java.util.Scanner;

public class EmailTask2 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String email = input.next();
            separating(email);
            input.close();

        }

        public static void separating (String email){
            int indexOfUnderscore = email.indexOf("_");
            int indexOfAtSign = email.indexOf("@");
            int dotCom = email.indexOf(".");
            String firstName = email.substring(0,indexOfUnderscore);
            String lastName = email.substring(indexOfUnderscore+1,indexOfAtSign);
            String domain = email.substring(indexOfAtSign+1,dotCom);
            String firstNameUpper = firstName.toUpperCase().substring(0,1);
           String lastNameUpper = lastName.toUpperCase().substring(0,1);
            System.out.println("First name: " +firstNameUpper+ firstName.substring(1));
            System.out.println("Last name: "+lastNameUpper+lastName.substring(1));
            System.out.println("Domain: "+domain);



}





}
/*
Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */