package circulardoubly;

import java.util.Scanner;

public class CircularDoubly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.print("ENTER HEAD ELEMENTS :");
        int h=sc.nextInt();
        for(int i=1;i<=h;i++)
        {
            System.out.print("ENTER ELEMENTS "+i+":");
            int ele=sc.nextInt();
            m.insertHead(ele);
        }
        System.out.print("ENTER TAIL ELEMENTS :");
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print("ENTER ELEMENTS :");
            int el=sc.nextInt();
            m.insertTail(el);
        }
       
        System.out.print("ENTER THE MID ELEMENTS :");
        int mid=sc.nextInt();
        System.out.print("ENTER THE POSITION :");
        int posi=sc.nextInt();
        m.positionAt(mid, posi);
        m.display();
    }
    
}
