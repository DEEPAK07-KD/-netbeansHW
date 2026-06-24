
package jdbc3;

import java.sql.*;
import java.util.ArrayList;
public class Dao {
    public Connection conn() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String pass = "Deepak@12";

        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }
    public void ins(Model m) throws ClassNotFoundException, SQLException
    {
        Connection c=conn();
        PreparedStatement ps=c.prepareStatement("insert into Students values(?,?,?,?,?)");
        ps.setInt(1, m.getId());
        ps.setString(2, m.getName());
        ps.setString(3, m.getEmail());
        ps.setString(4, m.getCourse());
        ps.setDouble(5, m.getFees());
        ps.executeUpdate();
    }
     public void del(Model m) throws ClassNotFoundException, SQLException
    {
        Connection c=conn();
        PreparedStatement ps=c.prepareStatement("delete from Students where id=?");
        ps.setInt(1, m.getId());
        ps.executeUpdate();
    }
     public void upd(Model m) throws ClassNotFoundException, SQLException
    {
        Connection c=conn();
        PreparedStatement ps=c.prepareStatement("update Students set name=? where id=?");
        ps.setString(1,m.getName());
        ps.setInt(2, m.getId());
        ps.executeUpdate();
    }
      public void sea(Model m) throws ClassNotFoundException, SQLException
    {
        Connection c=conn();
        PreparedStatement ps=c.prepareStatement("select * from Students where email=?");
        ps.setString(1,m.getEmail());
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            System.out.println(m.getId()+" : "+m.getName()+" : "+m.getEmail()+" : "+m.getCourse()+" : "+m.getFees());
        }
    }
     public ArrayList<Model> de() throws ClassNotFoundException, SQLException
    {
        ArrayList<Model> a=new ArrayList<>();
        Connection c=conn();
        PreparedStatement ps=c.prepareStatement("select * from Students");
        
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            Model m=new Model();
            m.setId(rs.getInt(1));
            m.setName(rs.getString(2));
            m.setEmail(rs.getString(3));
            m.setCourse(rs.getString(4));
            m.setFees(rs.getDouble(5));
            a.add(m);
        }
        return a;
    }
    
}
