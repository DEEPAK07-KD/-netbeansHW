package productinventorymanagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductInventoryManagement {

    Map<String, Integer> m=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    Scanner se=new Scanner(System.in);
    public static void main(String[] args) {
       ProductInventoryManagement pim = new ProductInventoryManagement();
       pim.main();
    }
    public void main(){
        boolean res=true;
        do {
            System.out.println("<---Product Inventory Management System--->");
            System.out.println("1.ADD PRODUCT");
            System.out.println("2.SEARCH PRODUCT");
            System.out.println("3.UPDATE QUANTITY");
            System.out.println("4.DELETE PRODUCT");
            System.out.println("5.DISPLAY ALL PRODUCT");
            System.out.println("6.EXIT");
            System.out.print("Enter the value : ");
            int val=sc.nextInt();
            if (val == 1) {
                add();
            }
            else if (val == 2) {
                search();
            }
            else if(val == 3){
                update();
            }
            else if (val == 4) {
                delete();
            }
            else if (val == 5) {
                display();
            }
            else{
                res=false;
            }
            
        } while (res);
    }
    
    public void add(){
        System.out.print("Enter Product Name : ");
        String name = se.nextLine();
        
        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();
        
        m.put(name, quantity);
        
        System.out.println("Product Added Successfully");
    }
    
    public void search(){
        System.out.print("Enter Product Name : ");
        String name = se.nextLine();
        
        if (m.containsKey(name)) {
            System.out.println("Product : "+ name);
            System.out.println("Quantity : "+m.get(name));
        } else{
            System.out.println("Product Not Found");
        }
    }
    
    public void update(){
        System.out.print("Enter Product Name : ");
        String name = se.nextLine();
        
        if (m.containsKey(name)) {
            System.out.print("Enter New Quantity : ");
            int quantity = sc.nextInt();
            
            m.put(name, quantity);
            System.out.println("Quantity Updated Successfully");
        } else{
            System.out.println("Product Not Found");
        }
    }
    
    public void delete(){
        System.out.print("Enter Product Name : ");
        String name = se.nextLine();
        
        if (m.containsKey(name)) {
            m.remove(name);
            System.out.println("Product Deleted Successfully");
        } else{
            System.out.println("Product Not Found");
        }
    }
    
    public void display(){
        if (m.isEmpty()) {
            System.out.println("No Product Available");
        }
        else{
            System.out.println("\n--- ALL Product ---");
            
            for (Map.Entry<String, Integer> entry : m.entrySet()) {
                System.out.println(entry.getKey() + " : "+ entry.getValue());
            }
        }
    }
}
