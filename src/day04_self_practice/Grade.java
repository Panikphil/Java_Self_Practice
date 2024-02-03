package day04_self_practice;

public class Grade {
    public static void main(String[] args) {

        char grade = 'B';

        if (grade == 'A'){
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Great job");
        } else if (grade == 'C') {
            System.out.println("Good");
        } else if (grade == 'D') {
            System.out.println("Passed");
        } else if (grade == 'F') {
            System.out.println("Failed");
        } else System.out.println("Invalid Grade");


        /*switch (grade){
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Great job");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Passed");
            case 'F' -> System.out.println("Failed");
            default -> System.out.println("Invalid Grade");
        }
*/

    }
}
/*
Create a class called Grade. A char variable named grade is given.
   Write a program to print the following messages:

		'A': Excellent
		'B': Great job
		'C': Good
		'D': Passed
		'F': Failed
		Otherwise: Invalid Grade
			Example:
				   grade = 'B'
			Output:
				  Great job
 */