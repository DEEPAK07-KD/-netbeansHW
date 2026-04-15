package customerplaceorder;

import java.util.Scanner;

public class CustomerPlaceOrder {
    Scanner se=new Scanner(System.in);
    int front=-1;
    int back=-1;
    String items[];
    int size;
    CustomerPlaceOrder(int size)
    {
        this.size=size;
        items=new String[size];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF OEDERS ->");
        int size=sc.nextInt();
        CustomerPlaceOrder cpo=new CustomerPlaceOrder(size);
        cpo.main();
    }
    void main()
    {
        boolean result=true;
        do{
        System.out.println("<--CUSTOMER PLACE ORDER-->");
        System.out.println("1.ADD ORDER");
        System.out.println("2.SERVE ORDER");
        System.out.println("3.VIEW NEXT ORDER");
        System.out.println("4.DISPLAY ALL ORDER");
        System.out.println("5.EXIT");
        System.out.print("CHOOSE YOUR OPTION :");
        int op=se.nextInt();
        if(op==1)
        {
            System.out.print("ENTER THE ORDER ->");
            String it=se.next();
            push(it);
            
        }
        else if(op==2)
        {
            pop();
        }
        else if(op==3)
        {
            next();
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
        if(back==size)
        {
            System.out.println("LIST IS FULL");
        }
        else
        {
            if(front==-1)
            {
                front=0;
            }
            back++;
            items[back]=data;
        }

    }
    void pop()
    {
        if(front==-1 || front>back)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            System.out.println("SERVED ORDER ->"+" "+items[front]);
            front++;
        }
    }
    void next()
    {
        System.out.println("NEXT ORDER ->"+" "+items[front]);
    }
    void peak()
    {
        for (int i = front; i <= back; i++) {
            System.out.println("PENDING ORDERS ->"+" "+items[i]);
        }
    }
}
