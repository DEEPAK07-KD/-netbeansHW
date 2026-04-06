package pkgonlineof;

import java.util.Scanner;

public class OnlineFood {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       FoodOrder order=null;
       boolean result=true;
       do{
           System.out.println("---ONLINE FOOD ORDER SYSTEM---");
           System.out.println("1.PLACE ORDER");
           System.out.println("2.VIEW BILL");
           System.out.println("3.EXIT");
           System.out.println("CHOOSE YOUR OPTION :");
           int op=sc.nextInt();
           if(op==1)
           {
               System.out.println("ENTER CUSTTOMER NAME :");
               String name=sc.next();
               System.out.println("ENTER THE ITEM :");
               String item=sc.next();
               System.out.println("ENTER THE PRICE :");
               double price=sc.nextDouble();
               order=new FoodOrder(name,item,price);
               order.placeOrder();
           }
           else if(op==2)
           {
               if(order != null)
               {
                   order.showBill();
               }
               else
               {
                   System.out.println("NO ORDER PLACED YET!");
               }
           }
           else
           {
               System.out.println("PROGRAM EXITING");
               result=false;
           }
       }while(result);
    }
    
}
