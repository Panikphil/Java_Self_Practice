package day09_self_practice;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int odd = 0;
        int even = 0;

        for (int i : arr) {
            if (i%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("The array has "+odd+" odd numbers and " + even +" even numbers.");


    }
}
/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

 */