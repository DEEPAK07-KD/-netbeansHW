
package transportmanagement;

import java.util.Scanner;

public class TransportManagement {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Transport t=null;
    int op;
    boolean booked=false;
        boolean result = true;
    
     do{
         System.out.println("---TRANSPORT MANAGEMENT SYSTEM---");
         System.out.println("1.CITY BUS BOOKING");
         System.out.println("2.LUXURY BUS BOOKING");
         System.out.println("3.CALCULATE FARE");
         System.out.println("4.DISPLAY TICKET");
         System.out.println("5.EXIT");
         System.out.print("CHOOSE YOUR OPTION :");
         op=sc.nextInt();
         switch (op) {
             case 1 ->                  {
                     t=new CityBus();
                     System.out.print("ENTER PASSANGER ID :");
                     t.id=sc.nextInt();
                     sc.nextLine();
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
             switch (r) {
                 case 1 -> {
                     t.tcity = "Bangalore";
                     t.dis = 350;
                 }
                 case 2 -> {
                     t.tcity = "Coimbatore";
                     t.dis = 500;
                 }
                 case 3 -> {
                     t.tcity = "Madurai";
                     t.dis = 460;
                 }
                 case 4 -> {
                     t.tcity = "Trichy";
                     t.dis = 330;
                 }
                 case 5 -> {
                     t.tcity = "Salem";
                     t.dis = 340;
                 }
                 default -> {
                     System.out.println("Invalid route! Defaulting to Bangalore");
                     t.tcity = "Bangalore";
                     t.dis = 350;
                 }
             }
booked=true;
                     System.out.println("Ticket Booked Successfully");
                 }
             case 2 ->                  {
                     t=new LuxuryBus();
                     System.out.print("ENTER PASSANGER ID :");
                     t.id=sc.nextInt();
                     sc.nextLine();
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
             switch (r) {
                 case 1 -> {
                     t.tcity = "Bangalore";
                     t.dis = 350;
                 }
                 case 2 -> {
                     t.tcity = "Coimbatore";
                     t.dis = 500;
                 }
                 case 3 -> {
                     t.tcity = "Madurai";
                     t.dis = 460;
                 }
                 case 4 -> {
                     t.tcity = "Trichy";
                     t.dis = 330;
                 }
                 case 5 -> {
                     t.tcity = "Salem";
                     t.dis = 340;
                 }
                 default -> {
                     System.out.println("Invalid route! Defaulting to Bangalore");
                     t.tcity = "Bangalore";
                     t.dis = 350;
                 }
             }
booked=true;
                     System.out.println("Ticket Booked Successfully");
                 }
             case 3 -> {
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
             case 4 -> {
                 if(booked)
                 {
                     
                     t.displayTicket();
                 }
                 else
                 {
                     System.out.println("NO TICKET TO DISPLAY");
                 }
             }
             default -> {
             result = false;
                 System.out.println("EXITING");
             }
         }
     }while(result);
    }
    
}
