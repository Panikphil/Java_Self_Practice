package day16_self_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {


        List<Integer> list1=new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        List<Integer>list2 =new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        mergeList(list1,list2);

    }


    public static void mergeList(List<Integer>list1, List<Integer>list2){
        List<Integer>list3 = new ArrayList<>();
        list3.addAll(list1);
        for (int i = 0; i < list2.size(); i++) {
            if(!list3.contains(list2.get(i))){
                list3.add(list2.get(i));
            }
        }
        System.out.println("list3 = " + list3);

    }


}
/*
 Create a class named MergeLists and write a program that merges two given lists of integers into a third list. Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

 */