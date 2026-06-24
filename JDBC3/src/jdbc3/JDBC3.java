package jdbc3;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBC3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        Scanner se=new Scanner(System.in);
        Service ss=new Service();
        Model sm=new Model();
        boolean res=true;
        do
        {
            System.out.println("1.INSERT STUDENT");
            System.out.println("2.VIEW ALL STUDENTT");
            System.out.println("3.UPDATE STUDENT BY ID");
            System.out.println("4.DELETE STUDENT BY ID");
            System.out.println("5.SEARCH STUDENT BY EMAIL");
            System.out.println("6.EXIT");
            System.out.print("CHOOSE YOUR OPTION : ");
            int op=sc.nextInt();
            if (op==1) {
                System.out.print("ENTER ID :");
                int id=sc.nextInt();
                System.out.print("ENTER NAME : ");
                String name=se.nextLine();
                System.out.print("ENTER EMAIL : ");
                String mail=se.nextLine();
                System.out.print("ENTER COURSE : ");
                String course=se.nextLine();
                System.out.print("ENETR FEES : ");
                double fee=sc.nextDouble();
                sm.setCourse(course);
                sm.setEmail(mail);
                sm.setFees(fee);
                sm.setId(id);
                sm.setName(name);
                ss.insert(sm);
            }
            else if (op==2) {
                ss.dis();
            }
            else if (op==3) {
                 System.out.print("ENTER ID :");
                int id=sc.nextInt();
                System.out.print("ENTER NEW NAME : ");
                String name=se.nextLine();
                sm.setName(name);
                sm.setId(id);
                ss.upda(sm);
            }
            else if (op==4) {
                System.out.print("ENTER ID :");
                int id=sc.nextInt();
                sm.setId(id);
                ss.dele(sm);
            }
            else if (op==5) {
                System.out.print("ENTER SEARCH EMAIL :");
                String mail=se.nextLine();
                
                sm.setEmail(mail);
                ss.sear(sm);
            }
            else
            {
                res=false;
            }
        }while(res);
    }
    
}
