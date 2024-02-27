package day17_self_practice;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "bbcccaaaaa";
        char[] chars = str.toCharArray();
        Integer counter=0;
        Map<Character,Integer>map= new LinkedHashMap<>();
        char temp = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==temp){
                counter++;
                map.put(temp,counter);
            }else {
                counter=1;
            }
            temp=chars[i];
        }
        System.out.println(map);

    }
}

/*
Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */