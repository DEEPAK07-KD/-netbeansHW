package bankinterestcal;

import java.util.Scanner;

public class BankInterestCal {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        BankInterestCal bi=new BankInterestCal();
        bi.main();
    }
    void main()
    {
        System.out.print("ENTER THE BANK NAME :");
        String n=sc.nextLine();
        Bank b=new Bank(n);
        boolean result=true;
        
        do{
            System.out.println("<--BANK INTEREST CALCULATED-->");
            System.out.println("1.PRINCIPAL AMOUNT");
            System.out.println("2.INTEREST AMOUNT CALCULATION");
            System.out.println("3.DISPLAY");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
                System.out.print("ENTER THE AMOUNT :");
                Bank.pri=sc.nextDouble();
                b.principal();
            }
            else if(op==2)
            {
                System.out.print("ENTER THE INTEREST AMOUNT :");
                Bank.interest=sc.nextDouble();
                System.out.print("ENTER YEAR :");
                Bank.year=sc.nextInt();
                b.calculate();
            }
            else if(op==3)
            {
                b.display();
            }
            else
            {
                result=false;
            }
        }while(result);
    }
}
