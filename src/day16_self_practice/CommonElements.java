package day16_self_practice;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        Set<Integer> set1=new TreeSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer>set2 =new TreeSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
       commonElements(set1,set2);

    }

    public static void commonElements(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>set3=new TreeSet<>();
        for (Integer i : set1) {
            for (Integer i2 : set2) {
                if(i.equals(i2)){
                    set3.add(i);
                }

            }

        }
        System.out.println("set3 = " + set3);

    }




    /*
     Create a class named CommonElements and write a program that identifies the common elements in two given sets of integers and returns a third set containing these common elements.

         Example:
            set1 = {10, 8, 11, 20, 5, 0}
            set2 = {30, 0, 20, 40, 50, 10, 60}

         Output:
            set3 = {0, 10, 20}
     */
}
