
package foodordering;


public class Oliva implements Pizza{
    Pizza p;

    public Oliva(Pizza p) {
        this.p = p;
    }

    @Override
    public String pizzaname() {
        return p.pizzaname()+", Oliva";
    }

    @Override
    public double totalprice() {
        return p.totalprice()+20;
    }
    
}
