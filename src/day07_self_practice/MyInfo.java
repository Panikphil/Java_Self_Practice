package day07_self_practice;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your gender:");
        String gender = input.next();
        System.out.println("Enter your full name:");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Enter your phone number:");
        int phone = input.nextInt();
        System.out.println("Enter your zip code:");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("Enter your School name:");
        String school = input.nextLine();
        //input.nextLine();
        System.out.println("Enter your city name:");
        String city = input.nextLine();
        System.out.println("Enter your state name:");
        String state = input.next();
        System.out.println("Enter your building number");
        int building = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Street name:");
        String street = input.nextLine();
        System.out.println(name+"\n"+age+"\n"+gender+"\n"+phone+"\n"+"Address:\n\t"
                +building+" "+ street+"\n\t"+city+", " + state +" "+zip);
        input.close();



    }
}
/*
Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */