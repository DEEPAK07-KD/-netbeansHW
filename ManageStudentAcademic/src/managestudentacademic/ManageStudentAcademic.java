package managestudentacademic;

import java.util.Arrays;
import java.util.Scanner;

public class ManageStudentAcademic {

    int ma;
    int sum;
    String name;
    Scanner sc = new Scanner(System.in);
    
    Institution i = new Institution();
    Institution.Student s = i.new Student();
    

    public static void main(String[] args) {
            ManageStudentAcademic msa=new ManageStudentAcademic();

        msa.main();
    }       

    void main() {
        boolean res = true;
        System.out.print("ENETR INSTITUTION NAME :");
        i.institutionName= sc.next();
        do {
            System.out.println("<--MANAGE STUDENT ACADEMIC-->");
            System.out.println("1.ADD STUDENT");
            System.out.println("2.ADD MARKS");
            System.out.println("3.CALCULATE GRADE");
            System.out.println("4.DISPLAY STUDENT DETAILS");
            System.out.println("5.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op = sc.nextInt();
            if (op == 1) {
                student();
            }
            else if(op==2)
            {
                marks();
            }
            else if(op==3)
            {
                calculate();
            }
            else if(op==4)
            {
                display();
            }
            else
            {
                res=false;
            }
        }while(res);
    }

    void student() {
        System.out.print("ENTER STUDENT NAME :");
        s.studentName = sc.next();
        System.out.print("ENTER ROLL NO :");
        s.rollNo = sc.nextInt();

    }

    void marks() {
        System.out.print("ENTER NO.OF.SUBJECT :");
        ma = sc.nextInt();
        s.mark = new int[ma];
        sum = 0;
        for (int i = 0; i < ma; i++) {
            System.out.println("ENTER THE MARK OF SUBJECT " + (i + 1) + ": ");
            s.mark[i] = sc.nextInt();
            sum += s.mark[i];
        }
    }

    void calculate() {
        s.average = sum / ma;
        if (s.average >= 90) {
            s.grade="A";
        } else if (s.average >= 75) {
            s.grade="B";
        } else if (s.average >= 50) {
            s.grade="C";
        } else {
            s.grade="FAILS";
        }
        System.out.println("SUCCESSFULLY");
    }

    void display() {
        
        System.out.println("INSTITUTION NAME :" + " " + i.institutionName);
        System.out.println("STUDENT NAME :" + " " + s.studentName);
        System.out.println("ROLL NO :" + " " + s.rollNo);
        System.out.println("MARKS :" + " " + Arrays.toString(s.mark));
        System.out.println("AVERAGE :" + " " + s.average);
        System.out.println("GRADE :" + " " + s.grade);
    }
}
