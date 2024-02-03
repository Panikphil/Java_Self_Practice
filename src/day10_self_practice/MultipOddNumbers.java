package day10_self_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultipOddNumbers {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (Integer i : list) {
          if(i%2!=0){
              int index = list.indexOf(i);
              i=i*2;
              list.set(index,i);
          }
        }
        System.out.println(list);



    }

}
/*
Create a class called MultipOddNumbers and write a program with the following specifications:
   6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]
 */