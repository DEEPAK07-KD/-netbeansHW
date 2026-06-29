
package markadaptor;


public class MarkAdaptor {

    
    public static void main(String[] args) {
      OldMarkSystem ms=new OldMarkSystem();
       GradSystem g=new Adaptor(ms);
        System.out.println("Total Mark : "+ms.totalmark());
        System.out.println("Grade : "+g.grade());
    }
    
}
