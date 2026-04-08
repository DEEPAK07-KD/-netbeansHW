
package employee;

public class Employees {
    private int empId;
    private String empName;
    private String designation;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0)
        {
        this.salary = salary;
        }
        else
        {
            System.out.println("INVALID SALARY!");
        }
    }

    public Employees(int empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }
    public void displayEmployeDetails()
    {
        System.out.println("--------------------");
        System.out.println("  EMPLOYEE DETAILS  ");
        System.out.println("--------------------");
        System.out.println("EMPLOYEE ID :"+" "+this.empId);
        System.out.println("EMPLOYEE NAME :"+" "+this.empName);
        System.out.println("EMPLOYEE DESIGINATION :"+" "+this.designation);
        System.out.println("EMPLOYEE SALARY :"+" "+this.salary);
    }
}
