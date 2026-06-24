
package foodordering;


public class FoodOrdering {

 
    public static void main(String[] args) {
        Pizza p=new PlainPizza();
        Pizza p1=new Cheese(p);
        Pizza p2=new Mushroom(p1);
        Pizza p3=new Oliva(p2);
        System.out.println("Description : "+p.pizzaname());
        System.out.println("    Cost    : "+p.totalprice());
        
         System.out.println("Description : "+p1.pizzaname());
        System.out.println("    Cost    : "+p1.totalprice());
        
         System.out.println("Description : "+p2.pizzaname());
        System.out.println("    Cost    : "+p2.totalprice());
        
         System.out.println("Description : "+p3.pizzaname());
        System.out.println("    Cost    : "+p3.totalprice());
        
    }
    
}
