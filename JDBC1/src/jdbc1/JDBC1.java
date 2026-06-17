package jdbc1;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBC1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBConnect db=new DBConnect();
        
        Scanner sc=new Scanner(System.in);
        boolean res=true;
        do
        {
            System.out.println("<--JDBC-->");
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("5.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
               db.insert();
            }
            else if(op==2)
            {
                db.display();
            }
            else if(op==3)
            {
                db.update();
            }
            else if(op==4)
            {
                db.delete();
            }
            else
            {
                res=false;
            }
        }while(res);
    }
    
}
