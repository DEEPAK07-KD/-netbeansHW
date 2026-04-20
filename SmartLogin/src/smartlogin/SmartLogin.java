package smartlogin;

import java.util.Scanner;

public class SmartLogin {
       static String username="admin";
       static String password="1234";
    public static void main(String[] args)  {
    Scanner sc=new Scanner(System.in);
     boolean res=true;
       do
       {
           System.out.println("<--SMART LOGIN SYSTEM-->");
           System.out.println("1.LOGIN");
           System.out.println("2.EXIT");
           System.out.print("CHOOSE YOUR OPTION :");
           int op=sc.nextInt();
           if(op==1)
           {
               try
               {
                  get(sc);
               }
               catch(Handling h)
               {
                   System.out.println(h.getMessage());
               }
           }
           else
           {
               System.out.println("EXITING SYSTEM");
               res=false;
           }
       }while(res);

    }
    public static void get(Scanner sc) throws Handling
    {
        int attempt=3;
        while(attempt>0)
        {
            System.out.print("ENTER USERNAME :");
            String user=sc.next();
            System.out.print("ENTER PASSWORD :");
            String pass=sc.next();
            if(user.equals(username) && pass.equals(password))
            {
                System.out.println("LOGIN SUCCESSFULLY");
                return;
            }
            else
            {
                attempt--;
                if(attempt==0)
                {
                    throw new Handling("AccountLockedException");
                }
                System.out.println("REMAINING ATTEMPTS :"+attempt);
            }
        }
    }    
}
