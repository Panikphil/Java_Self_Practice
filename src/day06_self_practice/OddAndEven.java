package day06_self_practice;

public class OddAndEven {
    public static void main(String[] args) {
        boolean isOdd = isOdd(100);
        System.out.println(isOdd);
        boolean isEven = isEven(100);
        System.out.println(isEven);
    }
    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    public static boolean isEven(int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }




}








/*

	1.1 Create a method named isOdd that returns true if a number is odd. Otherwise, it returns false.
		Example:
				boolean result = isOdd(100);
			Output:
				false
	1.2 Create a method named isEven that returns true if a number is even. Otherwise, it returns false.
			Example:
				boolean result = isEven(100);
			Output:
				true

 */