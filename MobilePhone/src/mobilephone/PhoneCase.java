
package mobilephone;


public class PhoneCase implements Mobile{
    Mobile m;

    public PhoneCase(Mobile m) {
        this.m = m;
    }

    @Override
    public String android() {
        return m.android()+" , Custom Printed Covers";
    }

    @Override
    public String iphone() {
        return m.iphone()+" , CEDO Magfit Transparent Case";
    }

    @Override
    public double andprice() {
       return m.andprice()+250;
    }

    @Override
    public double iphoneprice() {
       return m.iphoneprice()+200;
    }
    
}
