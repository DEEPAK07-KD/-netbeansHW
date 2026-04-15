package supermarketbill;

import java.util.Scanner;

public class SuperMarketBill {
   
     Scanner se=new Scanner(System.in);
     int top=-1;  
     String items[];
     int size;
     SuperMarketBill(int size)
     {
         this.size=size;
         items=new String[size];
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ITEMS :");
        int size=sc.nextInt();
        //String items[]=new String[size];
       SuperMarketBill smb=new SuperMarketBill(size);
       smb.main();
    }
    void main()
    {
        
        boolean result=true;
        do{
        System.out.println("<--SUPER MARKETING SYSTEMS-->");
        System.out.println("1.ADD ITEMS");
        System.out.println("2.UNDO LAST ITEMS");
        System.out.println("3.VIEW LAST SCANNED ITEM");
        System.out.println("4.DISPLAY ALL ITEMS");
        System.out.println("5.EXIT");
        System.out.print("CHOOSE YOUR OPTION :");
         int op=se.nextInt();
         if(op==1)
         {
             System.out.print("ENTER THE ITEMS :");
             String it=se.next();
             push(it);
         }
         else if(op==2)
         {
             pop();
         }
         else if(op==3)
         {
             last();
         }
         else if(op==4)
         {
             peak();
         }
         else
         {
             System.out.println("<--EXIT-->");
             result=false;
         }
        }while(result);
    }
    void push(String data)
    {
        if(top==size)
        {
            System.out.println("LIST IS FULL");
        }
        else
        {
            top++;
            items[top]=data;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            System.out.println(items[top]+"IS DELETED");
            top--;
        }
    }
    void last()
    {
        System.out.println(items[top]);
    }
    void peak()
    {
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }
}
