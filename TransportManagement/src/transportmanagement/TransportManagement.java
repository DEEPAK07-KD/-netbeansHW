
package transportmanagement;

import java.util.Scanner;

public class TransportManagement {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Transport t=null;
    boolean result=true;
    boolean booked=false;
     do{
         System.out.println("---TRANSPORT MANAGEMENT SYSTEM---");
         System.out.println("1.CITY BUS BOOKING");
         System.out.println("2.LUXURY BUS BOOKING");
         System.out.println("3.CALCULATE FARE");
         System.out.println("4.DISPLAY TICKET");
         System.out.println("5.EXIT");
         System.out.print("CHOOSE YOUR OPTION :");
         int op=sc.nextInt();
         if(op==1)
         {
            
             t=new CityBus();
             System.out.print("ENTER PASSANGER ID :");
             t.id=sc.nextInt();
             System.out.print("ENTER PASSANGER NAME :");
             t.name=sc.nextLine();
              System.out.println("Select Route:");
                System.out.println("1. Chennai -> Bangalore");
                System.out.println("2. Chennai -> Coimbatore");
                System.out.println("3. Chennai -> Madurai");
                System.out.println("4. Chennai -> Trichy");
                System.out.println("5. Chennai -> Salem");
                System.out.print("Enter route choice: ");
                int r = sc.nextInt();

                if (r == 1) 
                {
                    t.tcity = "Bangalore";
                    t.dis = 350;
                } 
                else if (r == 2) 
                {
                    t.tcity = "Coimbatore";
                    t.dis = 500;
                }
                else if (r == 3)
                {
                    t.tcity = "Madurai";
                    t.dis = 460;
                } 
                else if (r == 4) 
                {
                    t.tcity = "Trichy";
                    t.dis = 330;
                } 
                else if (r == 5) 
                {
                    t.tcity = "Salem";
                    t.dis = 340;
                } 
                else 
                {
                    System.out.println("Invalid route! Defaulting to Bangalore");
                    t.tcity = "Bangalore";
                    t.dis = 350;
                }
                booked=true;
                System.out.println("Ticket Booked Successfully");

         }
         else if(op==2)
         {
          
             t=new LuxuryBus();
             System.out.print("ENTER PASSANGER ID :");
             t.id=sc.nextInt();
             System.out.print("ENTER PASSANGER NAME :");
             t.name=sc.nextLine();
              System.out.println("Select Route:");
                System.out.println("1. Chennai -> Bangalore");
                System.out.println("2. Chennai -> Coimbatore");
                System.out.println("3. Chennai -> Madurai");
                System.out.println("4. Chennai -> Trichy");
                System.out.println("5. Chennai -> Salem");
                System.out.print("Enter route choice: ");
                int r = sc.nextInt();

                if (r == 1) 
                {
                    t.tcity = "Bangalore";
                    t.dis = 350;
                } 
                else if (r == 2) 
                {
                    t.tcity = "Coimbatore";
                    t.dis = 500;
                }
                else if (r == 3)
                {
                    t.tcity = "Madurai";
                    t.dis = 460;
                } 
                else if (r == 4) 
                {
                    t.tcity = "Trichy";
                    t.dis = 330;
                } 
                else if (r == 5) 
                {
                    t.tcity = "Salem";
                    t.dis = 340;
                } 
                else 
                {
                    System.out.println("Invalid route! Defaulting to Bangalore");
                    t.tcity = "Bangalore";
                    t.dis = 350;
                }
                booked=true;
                System.out.println("Ticket Booked Successfully");
 
         }
         else if(op==3)
         {
             if(booked)
             {
                 
                 t.calculateFare();
                 System.out.println("FARE CALCULATED SUCCESSFULLY");
             }
             else
             {
                 System.out.println("BOOK TICKET FIRST");
             }
         }
         else if(op==4)
         {
             
             if(booked)
             {
                 
                 t.displayTicket();
             }
             else
             {
                 System.out.println("NO TICKET TO DISPLAY");
             }
         }
         else
         {
             result=false;
             System.out.println("EXITING");
         }
     }while(result);
    }
    
}
