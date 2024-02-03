package day07_self_practice;

public class AddressClients {
    public static void main(String[] args) {

        Address adress1 = new Address();

        adress1.buildingNumber = 7925;
        adress1.street = "Jones Branch Dr";
        adress1.city = "McLean";
        adress1.state = "VA";
        adress1.zipCode = "22012";
        System.out.println(adress1);
        System.out.println("--------------------------------------");
    Address adress2 = new Address();
    adress2.buildingNumber=45;
    adress2.street="Smith st";
    adress2.city = "Brooklyn";
    adress2.state = "NY";
    adress2.zipCode ="11220";
        System.out.println(adress2);

    }
}
