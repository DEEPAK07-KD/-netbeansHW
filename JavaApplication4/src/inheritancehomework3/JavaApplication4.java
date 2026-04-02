
package inheritancehomework3;
import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner se=new Scanner(System.in);
        System.out.print("ENTER THE PRODUCT NAME :");
        String n=se.nextLine();
        System.out.print("ENTER THE PRICE OF PRODUCT :");
        double p=sc.nextDouble();
        System.out.print("ENTER THE WARRANTY :");
        int wa=sc.nextInt();
        System.out.print("ENTER THE DRESS NAME :");
        String dn=se.nextLine();
        System.out.print("ENTER THE DRESS PRICE :");
        double dp=sc.nextDouble();
        System.out.print("ENTER THE DRESS SIZE  :");
        char ds=se.next().charAt(0);
        System.out.print("ENTER THE FABRIC TYPE :");
        String ft=se.next();
        System.out.println("----------ELECTRONICS----------");
        Electronic e=new Electronic();
        e.war(n, p, wa);
        System.out.println("----------CLOTHINGS----------");
        Clothing c=new Clothing();
        c.cloth(dn, dp, ds, ft);


    }
    
}
