
package mobilephone;


public class Earbuds implements Mobile{
    Mobile m;

    public Earbuds(Mobile m) {
        this.m = m;
    }

    @Override
    public String android() {
        return m.android()+" , boAt Airdopes 141";
    }

    @Override
    public String iphone() {
        return m.iphone()+" , AirPods 4";
    }

    @Override
    public double andprice() {
        return m.andprice()+1099;
    }

    @Override
    public double iphoneprice() {
        return m.iphoneprice()+11900;
    }
    
}
