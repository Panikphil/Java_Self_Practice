package day04_self_practice;

public class MedianNumber {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        int num3 = 1;

        if (num1 > num2 & num1 > num3 & num3>num2){
            System.out.println(num3);
        } else if (num1 > num2 & num1 > num3 & num2 >num3) {
            System.out.println(num2);
        } else if (num2 > num1 & num2 > num3 & num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 & num2 > num3 & num3 > num1) {
            System.out.println(num3);
        } else if (num3 > num1 & num3 > num2 & num1 > num2) {
            System.out.println(num1);
        } else if (num3 > num1 & num3 > num2 & num2 > num1) {
            System.out.println(num2);
        } else System.out.println("Numbers should be distinct!");

    }
}
/*
 Create a class named MedianNumber. Write a program that finds the median number between
three DIFFERENT given integers (Assume that the given three integers are distinct numbers).
			Example:
				   a = 10;
				   b = 15;
				   c = 20;
			Output:
				  15 is the median number

 */