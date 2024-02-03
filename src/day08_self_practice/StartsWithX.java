package day08_self_practice;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        replacing(word);
        input.close();

    }

    public static void replacing (String word){
        if (word.contains("x")){
             String word2 = word.replaceFirst("x","a");
            System.out.println(word2);
        }
    }

}
/*
Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex
 */