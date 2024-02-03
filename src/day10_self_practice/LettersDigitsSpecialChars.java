package day10_self_practice;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        System.out.print("letters= \"");
        for (char each :str.toCharArray()) {
            if (Character.isLetter(each)) {
                System.out.print(each);
            }
        }
            System.out.print("\";");
        System.out.println();
        System.out.print("Digits = \"");
        for (char each :str.toCharArray()) {
            if (Character.isDigit(each)) {
                System.out.print(each);
            }
        }
        System.out.print("\";");
        System.out.println();
        System.out.print("specialChars = \"");
        for (char each :str.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                System.out.print(each);
            }
        }
        System.out.print("\";");

        }
}
/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

 */