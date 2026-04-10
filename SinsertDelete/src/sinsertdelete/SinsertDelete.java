package sinsertdelete;

import java.util.Scanner;

public class SinsertDelete {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        InDe id=new InDe();
       
        id.insert(25);
        id.insert(32);
        id.insert(45);
        id.insert(6);
        id.insert(24);
        id.insert(52);
        System.out.println("BEFORE DELETING");
        id.display();
        System.out.print("DELETED ELEMENTS :");
        int de=sc.nextInt();
        id.delete(de);
        System.out.println("AFTER DELETING");
        id.display();
    }
    
}
