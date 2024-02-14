package day14_self_practice.car_task;

public class CarClients {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Camry",2020,40_000,"Black");
        toyota.start();
        toyota.drive();
        toyota.stop();
        System.out.println(toyota);
        System.out.println("----------------");

        Honda honda = new Honda("Honda","Accord",2021,41_400,"Gray");
        honda.start();
        honda.drive();
        honda.stop();
        System.out.println(honda);
        System.out.println("----------------");

        BMW bmw = new BMW("BMW","Series 5",2019,59_000,"White");
        bmw.start();
        bmw.drive();
        bmw.stop();
        System.out.println(bmw);
        System.out.println("----------------");

        Audi audi = new Audi("Audi","A6",2023,69_000,"Red");
        audi.start();
        audi.drive();
        audi.stop();
        audi.autopark();
        System.out.println(audi);
        System.out.println("----------------");

        Mercedes mercedes = new Mercedes("Mercedes","GLA250",2023,67_500,"Light Gray");
        mercedes.start();
        mercedes.drive();
        mercedes.stop();
        mercedes.autopark();
        System.out.println(mercedes);
        System.out.println("----------------");

        Tesla tesla = new Tesla("Tesla","Model Y",2022,60_000,"Blue");
        tesla.start();
        tesla.drive();
        tesla.stop();
        tesla.autopark();
        tesla.selfDrive();
        System.out.println(tesla);
        System.out.println("----------------");

        Nio nio = new Nio("Nio","EL6",2023,59_999,"Green");
        nio.start();
        nio.drive();
        nio.stop();
        nio.autopark();
        nio.selfDrive();
        System.out.println(nio);
        System.out.println("----------------");

        CydeoCar cydeoCar = new CydeoCar("Cydeo","Cool Car",2024,80_000,"Blue");
        cydeoCar.start();
        cydeoCar.drive();
        cydeoCar.stop();
        cydeoCar.fly();
        System.out.println(cydeoCar);







    }
}
