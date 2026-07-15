
package game;

import java.util.Random;
import java.util.Scanner;


public class Game {
   static Scanner sc=new Scanner(System.in);
  static Random rd=new Random();
   
    public static void main(String[] args) {
        boolean res=true;
        do{
        System.out.print("Choose One Option : ");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
        
         System.out.print("User Choose One Option : ");
        int user=sc.nextInt();
        
      
        if (user<1||user>3) {
            System.out.println("Invalid Choice. Please Select 1,2 or 3");
            return;
        }
          int com=rd.nextInt(3)+1;
          String us="";
            if (user==1) {
                us="Rock";
            }
            else if (user==2) {
                us="Paper";
            }
            else {
                us="Scissors";
            }
            
            String comp="";
            if (com==1) {
                comp="Rock";
            }
            else if(com==2){
                comp="Paper";
            }
            else {
                comp="Scissors";
            }
            
            System.out.println("User Choice : "+us);
            System.out.println("Computer Choice : "+comp);
            
            if (user==com) {
                System.out.println("Result -> Draw");
            }
            else if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2)) {
                System.out.println("Result -> User Wins");
            }
            else {
                System.out.println("Result -> Computer Win");
            }
        }while(res);
    }
   
}
