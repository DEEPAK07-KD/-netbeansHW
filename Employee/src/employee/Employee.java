
package employee;

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("---EMPLOYEE MANAGEMENT SYSTEM---");
        System.out.print("ENTER THE EMPLOYEE ID :");
        int id=sc.nextInt();
        System.out.print("ENTER THE EMPLOYEE NAME :");
        String na=sc.next();
        System.out.print("ENTER THE EMP DESIGNATION :");
        String desi=sc.next();
        System.out.print("ENTER THE EMPLOYEE SALARY :");
        double sa=sc.nextDouble();
        Employees e=new Employees(id,na,desi,sa);
//        System.out.println(e.getEmpId());
//        System.out.println(e.getEmpName());
//        System.out.println(e.getDesignation());
//        System.out.println(e.getSalary());
          e.displayEmployeDetails();
    }
    
}
