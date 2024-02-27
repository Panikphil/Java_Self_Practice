package day16_self_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        removeDuplicates(list);
    }



    public static void removeDuplicates(List<Integer>list){
        List<Integer> tempList = new ArrayList<>();
        for (Integer i : list) {
            if(!tempList.contains(i)){
                tempList.add(i);
            }
        }
        tempList.sort(null);
        System.out.println(tempList);
    }


}
/*
Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}


 */