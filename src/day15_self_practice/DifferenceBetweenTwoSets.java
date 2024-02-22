package day15_self_practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(2, 3, 4));
        differenceBetweenTwoSets(set1, set2);

    }

    public static void differenceBetweenTwoSets(Set<Integer> set1, Set<Integer> set2) {
        for (Integer i : set2) {
            if (set1.contains(i)) {
                set1.remove(i);
            }

        }
        System.out.println(set1);


    }

}
/*

4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}

 */