
package mobilephone;


public class MobilePhone {

    
    public static void main(String[] args) {
        Mobile m=new BasePhones();
        Mobile m1=new ScreenGuard(m);
        Mobile m2=new PhoneCase(m1);
        Mobile m3=new WirelessCharger(m2);
        Mobile m4=new Earbuds(m3);
        System.out.println("-----------------------------");
        System.out.println("Base Phones");
        System.out.println("-----------------------------");
        System.out.println("Android Phone"+m.android());
        System.out.println("Android Price"+m.andprice()+"\n");
        System.out.println("iPhone"+m.iphone());
        System.out.println("iPhone Price"+m.iphoneprice());
        System.out.println("-----------------------------\n");
        System.out.println("-----------------------------");
        System.out.println("With Screen Guard");
        System.out.println("-----------------------------");
        System.out.println("Android Phone"+m1.android());
        System.out.println("Android Price"+m1.andprice()+"\n");
        System.out.println("iPhone"+m1.iphone());
        System.out.println("iPhone Price"+m1.iphoneprice());
        System.out.println("-----------------------------\n");
        System.out.println("-----------------------------");
        System.out.println("With Phone Case");
        System.out.println("-----------------------------");
        System.out.println("Android Phone"+m2.android());
        System.out.println("Android Price"+m2.andprice()+"\n");
        System.out.println("iPhone"+m2.iphone());
        System.out.println("iPhone Price"+m2.iphoneprice());
        System.out.println("-----------------------------\n");
        System.out.println("-----------------------------");
        System.out.println("With Wireless Charger");
        System.out.println("-----------------------------");
        System.out.println("Android Phone"+m3.android());
        System.out.println("Android Price"+m3.andprice()+"\n");
        System.out.println("iPhone"+m3.iphone());
        System.out.println("iPhone Price"+m3.iphoneprice());
        System.out.println("-----------------------------\n");
        System.out.println("-----------------------------");
        System.out.println("With Earbuds");
        System.out.println("-----------------------------");
        System.out.println("Android Phone"+m4.android());
        System.out.println("Android Price"+m4.andprice()+"\n");
        System.out.println("iPhone"+m4.iphone());
        System.out.println("iPhone Price"+m4.iphoneprice());
        System.out.println("-----------------------------\n");
    }
    
}
