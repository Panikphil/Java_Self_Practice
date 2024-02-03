package day08_self_practice;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        combineWords(word1, word2);
        input.close();
    }

    public static void combineWords (String word1,String word2){
       if (word1.charAt(word1.length() - 1) == word2.charAt(0)){  //because index != length !
            System.out.println(word1+word2.substring(1));
       }


        }




        }





/*
Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight
              Output:
                   oneight
 */