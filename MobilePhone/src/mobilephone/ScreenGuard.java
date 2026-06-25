
package mobilephone;


public class ScreenGuard implements Mobile{
    Mobile m;

    public ScreenGuard(Mobile m) {
        this.m = m;
    }
    
    @Override
    public String android() {
        return m.android()+" , Gorilla Glass";
    }

    @Override
    public String iphone() {
        return m.iphone()+" , Privacy Glass";
    }

    @Override
    public double andprice() {
        return m.andprice()+250;
    }

    @Override
    public double iphoneprice() {
       return m.iphoneprice()+1500;
    }
    
}
