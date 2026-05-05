package employeepayrollmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollManagement {
    Scanner sc=new Scanner(System.in);
    ArrayList<Employee> a=new ArrayList<>();
    public static void main(String[] args) {
        EmployeePayrollManagement epm=new EmployeePayrollManagement();
        epm.main();
    }
    void main()
    {
        boolean res=true;
        do
        {
        System.out.println("<--EMPLOYEE PAYROLL MANAGEMENT-->");
        System.out.println("1.ADD EMPLOYEES");
        System.out.println("2.SEARCH EMPLOYEE");
        System.out.println("3.UPDATE SALARY");
        System.out.println("4.DELETE EMPLOYEE DETAILS");
        System.out.println("5.CALCULATE NET SALARY");
        System.out.println("6.VIEW EMPLOYEE DETAILS");
        System.out.println("6.EXIT");
        System.out.print("CHOOSE YOUR OPTION :");
        int op=sc.nextInt();
        if(op==1)
        {
            add();
        }
        else if(op==2)
        {
            search();
        }
        else if(op==3)
        {
            update();
        }
        else if(op==4)
        {
            delete();
        }
        else if(op==5)
        {
            calculate();
        }
        else if(op==6)
        {
            details();
        }
        else
        {
            res=false;
        }
        }while(res);
    }
    void add()
    {
        Employee e=new Employee();
        System.out.print("ENTER EMPLOYEE NAME :");
        e.emp_name=sc.next();
        System.out.print("ENTER EMPLOYEE ID");
        e.emp_ID=sc.nextInt();
        System.out.print("ENTER EMPLOYEE DEPARTMENT :");
        e.dept=sc.next();
        System.out.print("ENTER EMPLOYEE BASIC SALARY :");
        e.basicsalary=sc.nextDouble();
        a.add(e);
    }
    void search()
    {
        System.out.print("ENTER SEARCH EMPLOYEE ID :");
        int searchid=sc.nextInt();
        boolean found=false;
        for (Employee em : a) {
            if(em.emp_ID==searchid)
            {
                System.out.println("EMPLOYEE FOUND");
                em.display();
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("EMPLOYEE NOT FOUND");
        }
    }
    void update()
    {
        System.out.print("ENTER UPDATED SALARY ID :");
        int sa=sc.nextInt();
        boolean found=false;
        for (Employee empl : a) {
            if(empl.emp_ID==sa)
            {
                System.out.print("ENTER UPDATED SALARY :");
                empl.basicsalary=sc.nextDouble();
                found=true;
            }
        }
        if(!found)
        {
            System.out.println("EMPLOYEE ID NOT FOUND");
        }
    }
    void delete()
    {
        System.out.print("ENTER DELETED ID :");
        int de=sc.nextInt();
        boolean found=false;
        for (Employee emplo : a) {
            if(emplo.emp_ID==de)
            {
                a.remove(emplo);
                System.out.println("DELETED SUCCESSFULLY");
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("EMPLOYEE NOT FOUND");
        }
    }
    
    void calculate()
    {
    System.out.print("ENTER EMPLOYEE ID :");      
    int ca=sc.nextInt();
    boolean found=false;
    for (Employee em : a) {
        if(em.emp_ID==ca)
        {
            double hra=20*em.basicsalary;
            double da=10*em.basicsalary;
            double pf=5*em.basicsalary;
            double netSalary=em.basicsalary+hra+da-pf; 
            System.out.println("BASIC SALARY :"+em.basicsalary);
            System.out.println("NET SALARY +"+netSalary);
            found=true;
        }
    }
    if(!found)
    {
        System.out.println("EMPPLOYEE ID NOT FOUND");
    }
        
    }
    void details()
    {
        
        for (Employee employee : a) {
            employee.display();
        }
    }
}
