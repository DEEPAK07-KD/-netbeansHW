package mobilephone;

public class WirelessCharger implements Mobile{
    Mobile m;

    public WirelessCharger(Mobile m) {
        this.m = m;
    }

    @Override
    public String android() {
        return m.android()+" , Anker 10W Wireless Charger";
    }

    @Override
    public String iphone() {
        return m.iphone()+" , Apple MagSafe Charger";
    }

    @Override
    public double andprice() {
        return m.andprice()+2125;
    }

    @Override
    public double iphoneprice() {
        return m.iphoneprice()+4000;
    }
    
}
