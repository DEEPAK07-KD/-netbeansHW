package doublylinkedlist;

import java.util.Scanner;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.println("ENTER THE ELEMENTS :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("ENTER ELEMENTS "+i+":");
            int ele=sc.nextInt();
            m.insert(ele);
        }
        
        System.out.print("ENTER THE MID ELEMENTS :");
        int mid=sc.nextInt();
        System.out.println("ENTER THE POSITION :");
        int pos=sc.nextInt();
        m.insertAtPosition(mid,pos);
        m.display();
        
    }
    
}
