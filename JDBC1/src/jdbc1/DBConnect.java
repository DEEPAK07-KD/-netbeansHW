package jdbc1;
import java.sql.*;
import java.util.Scanner;
public class DBConnect {
    Scanner si=new Scanner(System.in);
    Scanner sn=new Scanner(System.in);
    public Connection connect() throws SQLException, ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/HW6";
        String user="postgres";
        String passs="Deepak@12";
        Connection con=DriverManager.getConnection(url, user, passs);
        return con;
    }
    public void insert() throws SQLException, ClassNotFoundException
    {
        
        System.out.print("ENTER NAME : ");
        String name=sn.nextLine();
        
        System.out.print("ENTER ROLL NUMBER : ");
        int roll=si.nextInt();
        System.out.print("ENTER PHONE NUMBER : ");
        long pho=si.nextLong();
        Connection c=connect();
        Statement s=c.createStatement();
        s.executeUpdate("insert into student(Stu_Name,Stu_RollNo,Stu_Phone) values('"+name+"',"+roll+","+pho+")");
        System.out.println("INSERT");
    }
    public void display() throws SQLException, ClassNotFoundException
    {
         Connection c=connect();
        Statement s=c.createStatement();
        ResultSet rs=s.executeQuery("select * from student");
        System.out.println("Stu_id \t Stu_Name \t Stu_RollNo \t Stu_Phone");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getLong(4));
        }
    }
    public void update() throws SQLException, ClassNotFoundException
    {
         System.out.print("ENTER NEW PHONE NUMBER : ");
        long pho=sn.nextLong();
        
        System.out.print("ENTER ROLL NUMBER : ");
        int roll=si.nextInt();
      
        Connection c=connect();
        Statement s=c.createStatement();
        s.executeUpdate("update student set Stu_Phone="+pho+" where Stu_RollNo="+roll);
        System.out.println("UPDATED");
    }
    public void delete() throws SQLException, ClassNotFoundException
    {
         
        System.out.print("ENTER ROLL NUMBER : ");
        int roll=si.nextInt();
      
        Connection c=connect();
        Statement s=c.createStatement();
        s.executeUpdate("delete from student where Stu_RollNo="+roll);
        System.out.println("DELETED");
    }
}
