package jdbc2;
import java.sql.*;
import java.util.ArrayList;
public class StudentDao {
        
    public Connection connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/School";
        String user="postgres";
        String pass="Deepak@12";
        Connection co=DriverManager.getConnection(url, user, pass);
        return co;
    }
    public void ins(StudentModel sm) throws ClassNotFoundException, SQLException
    {
      Connection c = connect();
       PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?,?,?)");
        ps.setInt(1, sm.getId());
        ps.setString(2, sm.getName());
        ps.setString(3, sm.getEmail());
        ps.setString(4, sm.getCourse());
        
        ps.setDouble(5, sm.getFee());
        ps.executeUpdate();
    }
      public void deletd(StudentModel sm) throws ClassNotFoundException, SQLException
    {
      Connection c = connect();
       PreparedStatement ps=c.prepareStatement("delete from student where id=?");
        ps.setInt(1, sm.getId());
        
        ps.executeUpdate();
    }
        public void update(StudentModel sm) throws ClassNotFoundException, SQLException
    {
      Connection c = connect();
       PreparedStatement ps=c.prepareStatement("update student set name=? where id=?");
       ps.setString(1, sm.getName());
       ps.setInt(2, sm.getId());
       
    
        ps.executeUpdate();
    }
    public void search(StudentModel sm) throws ClassNotFoundException, SQLException
    {
        
        
      Connection c = connect();
       PreparedStatement ps=c.prepareStatement("select * from student where email=?");
       ps.setString(1,sm.getEmail());
       ResultSet rs= ps.executeQuery();
       while(rs.next())
       {
           System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)
                              +" : "+rs.getString(4)+" : "+rs.getDouble(5));
           
       }
       
    }
      public ArrayList<StudentModel> display() throws ClassNotFoundException, SQLException
    {
        ArrayList<StudentModel> a=new ArrayList<>();
      Connection c = connect();
      PreparedStatement ps = c.prepareStatement("select * from student");
      ResultSet rs=ps.executeQuery();
      while(rs.next())
      {
          StudentModel sm=new StudentModel();
          sm.setId(rs.getInt(1));
          sm.setName(rs.getString(2));
          sm.setEmail(rs.getString(3));
          sm.setCourse(rs.getString(4));
          sm.setFee(rs.getDouble(5));
          a.add(sm);
      }
      return a;
    }
}

