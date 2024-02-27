package day17_self_practice;

import java.util.LinkedHashMap;
import java.util.Map;
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";
        Map<Character, Integer> map = new LinkedHashMap<>();
        Map<Character, Integer> tempmap = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if(!(characterIntegerEntry.getValue() >1)){
                tempmap.put(characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
            }
        }
        System.out.println(tempmap);
    }
}


/*
Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */