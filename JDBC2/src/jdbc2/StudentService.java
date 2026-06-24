
package jdbc2;

import java.sql.SQLException;
import java.util.ArrayList;


public class StudentService {
    StudentDao sd=new StudentDao();
    public void insert(StudentModel sm) throws ClassNotFoundException, SQLException
    {
        sd.ins(sm);
    }
     public void dele(StudentModel sm) throws ClassNotFoundException, SQLException
    {
        sd.deletd(sm);
    }
     public void upda(StudentModel sm) throws ClassNotFoundException, SQLException
    {
        sd.update(sm);
    }
     public void sear(StudentModel sm) throws ClassNotFoundException, SQLException
    {
       
         sd.search(sm);
        
    }
      public void dis() throws ClassNotFoundException, SQLException
    {
        ArrayList<StudentModel> a=sd.display();
        for (StudentModel st : a) {
            System.out.println(st.getId()+":"+st.getName()+":"+st.getEmail()+":"+st.getCourse()+":"+st.getFee());
        }
    }
}
