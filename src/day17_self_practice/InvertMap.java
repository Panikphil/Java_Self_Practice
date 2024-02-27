package day17_self_practice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class InvertMap {
    public static void main(String[] args) {

        Map<Integer,Character>map = new LinkedHashMap<>();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');

        Map<Character,Integer>mapInvert = invertMap(map);
        System.out.println(mapInvert);

    }
    //
   public static Map<Character,Integer> invertMap(Map<Integer,Character> map){
        Map<Character,Integer>mapInvert = new LinkedHashMap<>();
      Iterator<Integer> itr = map.keySet().iterator();
      while (itr.hasNext()){
          Integer key = itr.next();
         mapInvert.put(map.get(key),key);
      }
      return (mapInvert);


    }

}
/*
Create a class named InvertMap and write a program that returns a new map which is the
inverted version of the provided map, meaning the keys become values and the values become keys.
It is assumed that there are no duplicate values in the original map.

         Example:
               map = {1="a", 2="b", 3="c"}

         Output:
               {"a"=1, "b"=2, "c"=3}
 */