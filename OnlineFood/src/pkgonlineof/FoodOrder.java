
package pkgonlineof;


public class FoodOrder extends Customer implements Order {
    String item;
    double price;
    FoodOrder(String name,String item,double price)
    {
        super(name);
        this.item=item;
        this.price=price;
    }
    public void placeOrder()
    {
        System.out.println("ORDER PLACED SUCCESSFULLY");
    }
    public void showBill()
    {
        System.out.println("COUSTOMER NAME :"+name);
        System.out.println("FOOD ITEM :"+item);
        System.out.println("PRICE :"+price);
    }
}
