package day06_self_practice;

public class DayAndMonth {
    public static void main(String[] args) {
        day(5);
        monthName(6);
        daysInMonth(6);
    }


    public static void day(int day) {

        String dayName = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" : (day == 4) ?
                "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : (day == 7) ? "Sunday" : "Invalid Number";
        System.out.println(dayName);
    }

    public static void monthName(int month) {

        String monthName = (month == 1) ? "Janurary" : (month == 2) ? "February" : (month == 3) ? "March" : (month == 4) ?
                "April" : (month == 5) ? "May" : (month == 6) ? "June" : (month == 7) ? "July" : (month == 8) ? "August" :
                (month == 9) ? "September" : (month == 10) ? "October" : (month == 11) ?
                        "November" : (month == 12) ? "December" :
                        "Invalid Number";
        System.out.println(monthName);
    }

    public static void daysInMonth(int dayMonth) {
        if (dayMonth == 1 || dayMonth == 3 || dayMonth == 7 || dayMonth == 8 || dayMonth == 10 || dayMonth == 12) {
            int days = 31;
            String monthName = (dayMonth == 1) ? "Janurary has " + days + " days"  : (dayMonth == 3) ?"March has " + days+ "days" :
                     (dayMonth == 7) ? "July has " + days+ " days" : (dayMonth == 8) ? "August has " + days+ "days" :
                     (dayMonth == 10) ? "October has " + days+ " days" : (dayMonth == 12) ? "December has " + days+ "days" :
                            "Invalid Number";
            System.out.println(monthName);

        } else if (dayMonth == 4 || dayMonth == 6 || dayMonth == 9 || dayMonth == 11) {
            int days = 30;
            String monthName = (dayMonth == 4) ?
                    "April has " + days+ " days" : (dayMonth == 6) ? "June has " + days+ " days" :
                    (dayMonth == 9) ? "September has " + days+ " days" : (dayMonth == 11) ?
                            "November has " + days+ " days" :
                            "Invalid Number";
            System.out.println(monthName);
        } else if (dayMonth==2) {
            int days = 28;
            String monthName = (dayMonth == 2) ? "February has " + days+ " days" : "Invalid Number";
            System.out.println(monthName);
        }else {
            System.out.println("Invalid number");



        }
    }
}
/*
3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

 */