package shopping;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        ShoppingCart sc=new ShoppingCart();
        boolean res=true;
        do{
            System.out.println("<---SHOPPING CART APPLICATION--->");
            System.out.println("1.ADD PRODUCT TO CART");
            System.out.println("2.VIEW CART ITEMS");
            System.out.println("3.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=se.nextInt();
            if(op==1)
            {
                System.out.println("<--ADD PRODUCT TO CART-->");
                System.out.print("ENTER THE PRODUCT ID :");
                int id=se.nextInt();
                System.out.print("ENTER THE PRODUCT NAME :");
                String name=se.next();
                System.out.print("ENTER THE PRODUCT PRICE :");
                double price=se.nextDouble();
                sc.insert(id, name, price);
            }
            else if(op==2)
            {
                sc.display();
            }
            else
            {
                res=false;
            }
        }while(res);
    }
    
}
