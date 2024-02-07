package day12_self_practice;

public class CandyClients {

    public static void main(String[] args) {

        Candy candy1 = new Candy("Twix",4,1.25,false);
        Candy candy2 = new Candy("snickers",3,0,true);
        //Candy candy3 = new Candy("Mars1",0,2.4,false);

        System.out.println(candy1);
        System.out.println(candy1.isHasPeanuts());
        System.out.println(candy2);
        System.out.println(candy2.isHasPeanuts());
       // System.out.println(candy3);
       // System.out.println(candy3.isHasPeanuts());


    }
}
