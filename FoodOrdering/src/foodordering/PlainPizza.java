
package foodordering;


public class PlainPizza implements Pizza{

    @Override
    public String pizzaname() {
        return "Plain Pizza";
    }

    @Override
    public double totalprice() {
        return 120;
    }
    
}
