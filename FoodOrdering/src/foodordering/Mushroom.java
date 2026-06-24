
package foodordering;


public class Mushroom implements Pizza{
    Pizza p;

    public Mushroom(Pizza p) {
        this.p = p;
    }

    @Override
    public String pizzaname() {
        return p.pizzaname()+", Mushroom";
    }

    @Override
    public double totalprice() {
        return p.totalprice()+25;
    }
    
}
