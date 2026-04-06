package areacs;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean result=true;
        do{
            
            System.out.println("----SHAPE AREA CALCULATOR----");
            System.out.println("1.CIRCLE");
            System.out.println("2.SQUARE");
            System.out.println("3.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
                System.out.print("ENTER RADIUS :");
                double r=sc.nextDouble();
                Circle c=new Circle(r);
                c.calculateArea();
            }
            else if(op==2)
            {
                System.out.print("ENTER SIDE :");
                double r=sc.nextDouble();
                Square s=new Square(r);
                s.calculateArea();
            }
            else
            {
                System.out.println("PROGRAM EXITING");
            }
        }while(result);
    }
    
}
