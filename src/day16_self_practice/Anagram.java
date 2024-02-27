package day16_self_practice;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";
       compareAnagram(str1,str2);
        String str3 = "xyze";
        String str4 = "xyzd";
        compareAnagram(str3,str4);


    }

    public static void compareAnagram (String str1,String str2){
        HashSet<Character> charArray1 = new HashSet<Character>();
        HashSet<Character> charArray2 = new HashSet<Character>();
        for (char c : str1.toCharArray()) {
            charArray1.add(c);
        }
        for (char c : str2.toCharArray()) {
            charArray2.add(c);
        }
       // System.out.println(charArray1);
       // System.out.println(charArray2);
        System.out.println(charArray1.containsAll(charArray2));


    }

}
/*
Create a class named Anagram and write a program that checks if two strings are anagrams of each other, considering only the distinct characters in each string (ignoring duplicates).

         Example1:
            str1 = "abcd"
            str2 = "ccddabaa"

         Output:
            true


         Example2:
            str1 = "xyze"
            str2 = "xyzd"

         Output:
            false
 */