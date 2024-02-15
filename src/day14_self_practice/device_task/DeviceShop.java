package day14_self_practice.device_task;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","Iphone 15",999,"Gray","Pro",true,true);
        iphone.turnOn();
        iphone.call(555333442);
        iphone.text(555333222);
        iphone.downloadApp();
        iphone.turnOff();
        System.out.println(iphone);

        System.out.println("---------------------");

        Samsung samsung = new Samsung("Samsung","Galaxy s14",1050,"Purple","Note",true,true);
        samsung.turnOn();
        samsung.call(444444213);
        samsung.text(2141451252);
        samsung.downloadApp();
        samsung.turnOff();
        System.out.println(samsung);

        System.out.println("---------------------");

        Google google = new Google("Google","Pixel 8", 960,"Black","Pro",true,true);
        google.turnOn();
        google.call(312421442);
        google.text(421412424);
        google.downloadApp();
        google.turnOff();
        System.out.println(google);

        System.out.println("---------------------");

        Desktop desktop = new Desktop("Dell","B4545",400,"Black","ATX",false,true);
        desktop.turnOn();
        desktop.turnOff();
        System.out.println(desktop);

        System.out.println("---------------------");

        Laptop laptop = new Laptop("Lenovo","Legion 5",900,"Gray","15.6",true,true);
        laptop.turnOn();
        laptop.turnOff();
        System.out.println(laptop);


    }


}
