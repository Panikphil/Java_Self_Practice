package day10_self_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

    ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
            int max=0;
        int min=list.get(0);
        for (int i = 0; i <list.size() ; i++){
            if(list.get(i)>max){
            max = list.get(i);
        }
        }
        System.out.println("Maximum number is "+max);
        for (int i = 0; i <list.size() ; i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println("Minimum number is "+min);


    }
}
/*
 Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */