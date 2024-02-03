package day04_self_practice;

public class OxygenTank {
    public static void main(String[] args) {

        int level = 75;

        if (level >= 90 & level <=100){
            System.out.println("Your tank is full");
        }else if (level >= 80 & level <=89) {
            System.out.println("Still okay");
        } else if (level >= 70 & level <=79) {
            System.out.println("Don't go too far");
        } else if (level >= 60 & level <=69) {
            System.out.println("Start to head back");
        } else if (level >= 50 & level <=59) {
            System.out.println("Be careful, you're at 50%");
        }else
            System.out.println("LOW OXYGEN!");

    }
}
/*
Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:
		Above 90 - Your tank is full
		Above 80 - Still okay
		Above 70 - Don't go too far
		Above 60 - Start to head back
		Above 50 - Be careful, you're at 50%
			Example:
				   oxygenLevel = 75;
			Output:
				  Don't go too far
 */