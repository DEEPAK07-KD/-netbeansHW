
package ObserverDP;


public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Customer cus = new Customer("Deepak");
        
        order.addCustomer(cus);
        order.changeStatus("Ordered");
        order.changeStatus("Picked");
        order.changeStatus("Shipped");
        order.changeStatus("Delivered");
    }
}
