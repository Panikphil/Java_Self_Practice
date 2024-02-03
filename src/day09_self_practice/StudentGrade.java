package day09_self_practice;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {

        String[] studentNames = {"Tom", "Sara", "Jake", "Daniel", "Stacey"};
        int[] scores = {80, 92, 78, 81, 88};
        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] > 100 || scores[i] < 0) {
                System.err.println("Invalid score: " + scores[i]);
                return;
            }
            if (scores[i] > 89)
                grades[i] = 'A';
            else if (scores[i] > 79)
                grades[i] = 'B';
            else if (scores[i] > 69)
                grades[i] = 'C';
            else if (scores[i] > 59)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        System.out.println("grades = " + Arrays.toString(grades));

        for (int i = 0; i < 5; i++) {
            System.out.println(studentNames[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }
    }

}



/*
 Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B

 */