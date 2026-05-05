package employeepayrollmanagement;

public class Employee {
        int emp_ID;
        String emp_name;
        String dept;
        double basicsalary;

    public Employee() {
        this.basicsalary=basicsalary;
        this.dept=dept;
        this.emp_ID=emp_ID;
        this.emp_name=emp_name;
    }
        void display()
        {
            System.out.println("EMPLOYEE NAME :"+emp_name);
            System.out.println("EMPLOYEE ID :"+emp_ID);
            System.out.println("DEPARTMENT :"+dept);
            System.out.println("BASIC SALARY :"+basicsalary);
        }
}
