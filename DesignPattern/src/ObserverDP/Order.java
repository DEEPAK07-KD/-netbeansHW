
package ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Observer> customers = new ArrayList<>();
    
    public void addCustomer(Observer customer){
        customers.add(customer);
    }
    
    public void changeStatus(String status){
        String message = "";
        if (status.equals("Ordered")) {
            message="Your Order Has Been Placed Successfully.";
        }
        else if (status.equals("Picked")) {
            message="Your Order Has Been Packed.";
        }
        else if (status.equals("Shipped")) {
            message="Your Order Has Been Shipped.";
        }
        else if (status.equals("Delivered")) {
            message="Your Order Has Been Delivered Successfully.";
        }
        
        System.out.println("Order Status: "+status);
        
        for (Observer customer : customers) {
            customer.update(message);
        }
    }
}
