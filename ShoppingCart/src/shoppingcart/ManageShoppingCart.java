package shoppingcart;

import java.util.Arrays;
import java.util.Scanner;

public class ManageShoppingCart {

    ShoppingCart sc = new ShoppingCart();
    ShoppingCart.Item si = sc.new Item();
    double latestprice;
    double total;
    Scanner se = new Scanner(System.in);

    public static void main(String[] args) {
            ManageShoppingCart msc=new ManageShoppingCart();
            msc.main();
    }

    void main() {
        System.out.print("ENTER THE OWNER NAME :");
        sc.cartOwnerName = se.next();
        boolean res = true;
        do{
        System.out.println("<--MANAGE A SIMPLE SHOPPING CART-->");
        System.out.println("1.ADD ITEM");
        System.out.println("2.UPDATE PRICE HISTORY");
        System.out.println("3.CALCULATE TOTAL BILL");
        System.out.println("4.DISPLAY CART DETAILS");
        System.out.println("5.EXIT");
        System.out.print("CHOOSE YOUR OPTION :");
        int op = se.nextInt();
        if (op == 1) {
            add();
        } else if (op == 2) {
            updatePrice();
        }
        else if(op==3)
        {
          calculateTotal();
        }
        else if(op==4)
        {
            display();
        }
        else 
        {
            res=false;
        }
        }while(res);
    }

    void add() {
        System.out.print("ENTER THE ITEM NAME :");
        si.itemName = se.next();
        System.out.print("ENTER THE QUANTITY :");
        si.quantity = se.nextInt();

    }

    void updatePrice() {
        System.out.print("ENTER NUMBER OF PRICE UPDATES :");
        int up = se.nextInt();
        si.priceHistory = new double[up];
        latestprice = 0;
        for (int i = 0; i < up; i++) {
            System.out.print("ENTER THE PRICE " + (i + 1) + ":");
            si.priceHistory[i] = se.nextInt();
            latestprice = si.priceHistory[up-1];
            
            
        }
    }

    void calculateTotal() {
        total = latestprice*si.quantity;
    }

    void display() {
        System.out.println("CART OWNER :" + sc.cartOwnerName);
        System.out.println("ITEM NAME :" + si.itemName);
        System.out.println("QUANTITY :" + si.quantity);
        System.out.println("PRICE HISTORY :" + Arrays.toString(si.priceHistory));
        System.out.println("LATEST PRICE :" + latestprice);
        System.out.println("TOTAL BILL :" + total);
    }
}
