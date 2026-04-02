
package inheritancehomework2;
import java.util.Scanner;

public class JavaApplication3 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NAME :");
        String na=sc.nextLine();
        System.out.print("ENTER THE EMPLOYEE SALARY :");
        double sa=sc.nextDouble();
        System.out.print("ENTER THE MANAGER DEPARTMENT :");
        String dep=sc.next();
        Manager m1=new Manager();
        m1.per(na);
        m1.emp(sa);
        m1.man(dep);
    }
    
}
