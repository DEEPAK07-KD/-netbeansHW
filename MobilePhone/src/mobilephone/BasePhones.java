package mobilephone;

public class BasePhones implements Mobile{

    @Override
    public String android() {
       return "Android Phone"; 
    }

    @Override
    public String iphone() {
        return "iPhone";
    }

    @Override
    public double andprice() {
        return 15000;
    }

    @Override
    public double iphoneprice() {
        return 50000;
    }

    
    
}
