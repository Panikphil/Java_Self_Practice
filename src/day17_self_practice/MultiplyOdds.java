package day17_self_practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MultiplyOdds {
    public static void main(String[] args) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        multiplyOdds(map);

    }

    public static void multiplyOdds (Map<Character,Integer> map){
       Iterator<Character>itr =map.keySet().iterator();
       while (itr.hasNext()){
           Character key = itr.next();
          // System.out.println(key);
           if(map.get(key)%2!=0){
               map.put(key,map.get(key)*2);
           }

       }
        System.out.println(map);
    }
}
/*
Create a class named MultiplyOdds and write a program that takes a map with characters as keys
and integers as values. The program will iterate through the map and, for each entry where the value
is an odd number, it will multiply this value by two.

         Example:
               map = {'a'=1, 'b'=2, 'c'=3, 'd'=4, 'e'=5}

         Output:
            {'a'=2, 'b'=2, 'c'=6, 'd'=4, 'e'=10}
 */