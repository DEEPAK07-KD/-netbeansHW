
package jdbc3;

import java.sql.SQLException;
import java.util.ArrayList;


public class Service {
    
    Dao d=new Dao();
    
    public void insert(Model m) throws ClassNotFoundException, SQLException
    {
        d.ins(m);
    }
    public void dis() throws ClassNotFoundException, SQLException
    {
        ArrayList<Model> a=d.de();
        for (Model mo : a) {
            System.out.println(mo.getId()+" : "+mo.getName()+" : "+mo.getEmail()+" : "+mo.getCourse()+" : "+mo.getFees());    
        }
    }
    public void upda(Model m)throws ClassNotFoundException, SQLException
    {
        d.upd(m);
    }
    public void dele(Model m)throws ClassNotFoundException, SQLException
    {
        d.del(m);
    }
    public void sear(Model m)throws ClassNotFoundException, SQLException
    {
        d.sea(m);
    }
   
    
}
