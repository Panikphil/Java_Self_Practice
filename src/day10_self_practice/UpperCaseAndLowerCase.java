package day10_self_practice;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int lowerCount = 0;
        int upperCount = 0;
        for (char each : str.toCharArray()) {
            if (Character.isLowerCase(each)) {
                lowerCount++;
            } else if (Character.isUpperCase(each)) {
                upperCount++;
            }

        }
        System.out.println(lowerCount == upperCount);

    }


}
/*
 Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */