package atmsystem;


import java.util.Scanner;

public class AtmSystem {

static double with;
    public static void main(String[] args) throws Handling {
        double balance=0;
       Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE AMOUNT :");
        double amo=sc.nextDouble();
        balance=amo+balance;
        System.out.println(balance);
      
        boolean result=true;
        do
        {
            System.out.println("<--ATM SYSTEM-->");
            System.out.println("1.WITHDRAW MONEY");
            System.out.println("2.CHECK AMOUNT BALANCE");
            System.out.println("3.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
               System.out.print("ENTER THE WITHDRAW AMOUNT :");
               with=sc.nextDouble();
                if(with<=balance)
                {
                    balance=balance-with;
                }
                System.out.println(with);
               try
               {
                   get(with);
               }
               catch(Handling h)
               {
                  get(with); 
               }
            }
            else if(op==2)
            {
                System.out.println(balance);
            }
            else
            {
                result=false;
            }
        }while(result);
    }
   static void get(double with) throws Handling
    {
        double balance=1000;
        if(balance>with)
        {
            throw new Handling("Insufficient Balance Handling");
        }
    }
}
