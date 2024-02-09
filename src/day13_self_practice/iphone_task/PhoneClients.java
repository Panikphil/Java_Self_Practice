package day13_self_practice.iphone_task;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Iphone","15","Pro",1100,"Red");
        iPhone.call("+1(555)555-44-33");
        iPhone.text("+1(344)444-33-22");
        iPhone.faceTime("+1(333)333-22-11");
        System.out.println(iPhone);

        System.out.println("--------------------");
        Samsung samsung = new Samsung("Samsung","Galaxy","Note",999.99,"Purple");
        samsung.call("+1(444)432-11-22");
        samsung.text("+5(777)-654-321");
        samsung.faceTime("213-21-23");
        System.out.println(samsung);
        System.out.println("-------------------------");
        Nokia nokia = new Nokia("Nokia","3310","Regular",100,"Black");
        nokia.call("+1(888)-333-22-11");
        nokia.text("+4(333)321-678-99");
        nokia.faceTime("555-55-55");
        System.out.println(nokia);

    }
}
