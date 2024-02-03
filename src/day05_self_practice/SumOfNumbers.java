package day05_self_practice;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum=0;
        int gnum=50;
        for (int i = 0; i <=gnum ; i++) {
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
/*
Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100
				Output:
					  5050
				Example 2:
					    number = 50
				Output:
					  1275
 */