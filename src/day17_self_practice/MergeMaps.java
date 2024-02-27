package day17_self_practice;

import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('A', 10);
        map.put('B', 20);
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        map1.put('B', 30);
        map1.put('C', 40);

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {

            if (map1.containsKey(entry.getKey())) {
                map1.put(entry.getKey(), map1.get(entry.getKey()) + entry.getValue());
            }
        }
        for (Map.Entry<Character, Integer> entry1 : map1.entrySet()) {
            map.put(entry1.getKey(),entry1.getValue());
        }
        System.out.println(map);

        }
        }







/*
 Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}
 */