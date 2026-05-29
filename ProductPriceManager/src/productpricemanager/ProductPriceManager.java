package productpricemanager;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductPriceManager {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       ProductPriceManager ppm=new ProductPriceManager();
       ppm.main();
    }
    void main()
    {
        System.out.print("ENTER THE SIZE OF ARRAY :");
        int size=sc.nextInt();
        int[] ar=new int[size];
        boolean res=true;
        do
        {
            System.out.println("<--PRODUCT PRICE MANAGER-->");
            System.out.println("1.ADD PRODUCT PRICE TO ARRAY");
            System.out.println("2.COPY PRICES TO ARRAY LIST");
            System.out.println("3.DISPLAY PRICES");
            System.out.println("4.FIND MAXIMUM PRICE");
            System.out.println("5.REMOVE PRICE");
            System.out.println("6.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if (op==1) 
            {
                array(ar);
            }
            else if(op==2)
            {
                arrayList(ar);
            }
            else if(op==3)
            {
                display(ar);
            }
            else if(op==4)
            {
                max(ar);
            }
            else if(op==5)
            {
                remove(ar);
            }
            else
            {
                res=false;
            }
        }while(res);
    }
    void array(int ar[])
    {
        for (int i = 0; i < ar.length; i++) {
            System.out.print("THE INDEX OF "+i+" VALUE IS :");
            ar[i]=sc.nextInt();
        }
        System.out.println("PRICE STORED ARRAY");
    }
    void arrayList(int ar[])
    {
        ArrayList al=new ArrayList();
        for (int i = 0; i < ar.length; i++) {
           al.add(ar[i]);
        }
        System.out.println("PRICE COPIED TO ARRAY LIST");
        System.out.println("THE ARRAY LIST VALUES :");
        System.out.println(al);
    }
    void display(int ar[])
    {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
    void max(int ar[])
    {
        int m=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>m)
            {
                m=ar[i];
            }
        }
        System.out.println("THE MAXIMUM NUMBER :"+m);
    }
    void remove(int ar[])
    {
        
        System.out.print("ENTER THE REMOVE PRICE INDEX :");
        int r=sc.nextInt();
        System.out.println("REMOVING PRICE :");
        for (int i = 0; i < ar.length; i++) {
            if (r!=i) {
                System.out.println(ar[i]);
            }
        }
    }
}
