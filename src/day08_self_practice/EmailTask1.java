package day08_self_practice;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.next();
        reversing(email);
        input.close();

    }

    public static void reversing (String email){
      if (!email.contains("_")){
            System.out.println(email);
        }else{
        int indexOfUnderscore = email.indexOf("_");
        int indexOfAtSign = email.indexOf("@");
String update1 = email.substring(0,indexOfUnderscore);
String update2 = email.substring(indexOfUnderscore+1,indexOfAtSign);
String afterAt = email.substring(indexOfAtSign);
        System.out.println(update2+"_"+update1+afterAt);}


    }

}
/*
Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com

 */