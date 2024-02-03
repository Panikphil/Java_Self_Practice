package day08_self_practice;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        concatWithout(word1,word2);
        input.close();

    }

    public static void concatWithout (String word1,String word2){
        String wordv1 =word1.substring(1);
        String wordv2 =word2.substring(1);
        System.out.println(wordv1+wordv2);


    }

}
/*
Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */