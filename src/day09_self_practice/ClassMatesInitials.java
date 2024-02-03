package day09_self_practice;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names ={"John Doe", "Peter Smith", "Tom Jones", "Sara Parker",
                    "Michele Ross", "Philip Green", "Ted Wood", "Lisa Long", "Henry Red", "Aaron Kent"};

        for (String name : names) {
            System.out.println(name.charAt(0)+""+name.charAt(name.indexOf(" ")+1));
        }



    }

}
/*
 Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */