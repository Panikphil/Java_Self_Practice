package day13_self_practice.state_task;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia","VA","Democratic","Glenn Youngkin",
        "Mark Warner",8_642_000);
        System.out.println(virginia);
        virginia.nicknames();

        System.out.println("-----------------------------");

        California california = new California("California","CA","Democratic","Gavin Newsom"
        ,"Laphonza Butler",39_240_000);
        System.out.println(california);
        california.nicknames();

        System.out.println("------------------------");

        Texas texas = new Texas("Texas","TX","Republican","Greg Abbott",
                "Ted Cruz",29_530_000);
        System.out.println(texas);
        texas.nicknames();

        System.out.println("--------------------------");

        Florida florida = new Florida("Florida","FL","Republican","Ron DeSantis",
                "Rick Scott",21_780_000);
        System.out.println(florida);
        florida.nicknames();







    }
}
