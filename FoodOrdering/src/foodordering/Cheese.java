package foodordering;

public class Cheese implements Pizza{
    Pizza p;

    public Cheese(Pizza p) {
        this.p = p;
    }
    
    @Override
    public String pizzaname() {
        return p.pizzaname()+", Cheese";
    }

    @Override
    public double totalprice() {
        return p.totalprice()+30;
    }
    
}
