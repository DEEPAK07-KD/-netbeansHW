
package bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ACCOUNT NUMBER :");
        long no=sc.nextLong();
        System.out.print("ENTER ACCOUNT HOLDER NAME :");
        String na=sc.next();
        System.out.println("ENTER BALANCE :");
        double bal=sc.nextDouble();
        BankAccount ba=new BankAccount(no,na,bal);
        boolean result=true;
        do{
            System.out.println("---BANKING MANAGEMENT SYSTEM---");
            System.out.println("1.DEPOSITE");
            System.out.println("2.WITHDRAW");
            System.out.println("3.DISPLAY ACCOUNT DETAILS");
            System.out.println("4.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
                System.out.print("ENTER THE DEPOSITE AMOUNT :");
                double amo=sc.nextDouble();
                ba.deposite(amo);
                System.out.println("DEPOSITED AMOUNT IS :"+" "+amo);
            }
            else if(op==2)
            {
                System.out.print("ENTER THE WITHDRAW AMOUNT :");
                double wi=sc.nextDouble();
                ba.withdraw(wi);
                System.out.println("WITHDRAWEL AMOUNT IS :"+" "+wi);
            }
            else if(op==3)
            {
                ba.setBalance(bal);
                ba.getBalance();
                ba.displayAccountDetails();
            }
            else
            {
                result=false;
                System.out.println("PROCESS ENDED");
            }
        }while(result);
    }
    
}
