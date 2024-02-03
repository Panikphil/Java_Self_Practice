package day09_self_practice;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Peter Smith", "Tom Jones", "Sara Parker",
                "Michele Ross", "Philip Green", "Ted Wood", "Lisa Long", "Henry Red", "Aaron Kent"};

        // 6.3 Reverse each student's name and print them on separate lines.
        for (int i = 0; i <names.length; i++){
            System.out.println();
            for (int j = names[i].length()-1; j >=0 ; j--) {
                System.out.print(names[i].charAt(j));

            }


        }


        }
    }

/*
Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */