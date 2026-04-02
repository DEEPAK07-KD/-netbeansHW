
package inheritancehomework1;
import java.util.Scanner;
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NAME :");
        String s=sc.nextLine();
        System.out.print("ENTER THE AGE :");
        int a=sc.nextInt();
        Scanner se=new Scanner(System.in);
        System.out.print("ENTER THE ROLL NO :");
        int rn=se.nextInt();
        System.out.print("ENTER THE MARKS :");
        int m=se.nextInt();
        
        Student s1=new Student();
        s1.pers(s, a);
        s1.stud(rn,m);
    }
    
}
