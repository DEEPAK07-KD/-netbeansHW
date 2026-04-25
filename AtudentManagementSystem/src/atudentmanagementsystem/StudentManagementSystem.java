package atudentmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> l=new ArrayList<>();
    public static void main(String[] args) {
         StudentManagementSystem sms=new StudentManagementSystem();
         sms.main();
    }
    void main()
    {
        boolean res=true;
        do{
        System.out.println("<--STUDENT MANAGEMENT SYSTEM-->");
        System.out.println("1.ADD STUDENT");
        System.out.println("2.VIEW STUDENT");
        System.out.println("3.SEARCH STUDENT");
        System.out.println("4.UPDATE STUDENT MARKS");
        System.out.println("5.DELETE STUDENT");
        System.out.println("6.EXIT");
        System.out.print("CHOOSE YOUR OPTION :");
        int op=sc.nextInt();
        if(op==1)
        {
            add();
        }
        else if(op==2)
        {
            view();
        }
        else if(op==3)
        {
            search();
        }
        else if(op==4)
        {
            update();
        }
        else if(op==5)
        {
            delete();
        }
        else
        {
            res=false;
        }
        }while(res);
    }
    void add()
    {    Student s=new Student();

        System.out.print("ENTER NAME :");
        s.name=sc.next();
        System.out.print("ENTER AGE :");
        s.age=sc.nextInt();
        System.out.print("ENTER ROLL NO :");
        s.rollnumber=sc.nextInt();
        System.out.print("ENTER COURSE :");
        s.course=sc.next();
        System.out.print("ENTER MARKS :");
        s.marks=sc.nextInt();
       l.add(s);
    }
    void view()
    {
        for (Student s : l) {
                s.display();
        }
        
    }
    void search()
    {
        System.out.print("ENTER THE ROLL NO TO SEARCH :");
        int searchno=sc.nextInt();
        boolean found=false;
        for (Student s : l) {
            if(s.rollnumber == searchno)
            {
                System.out.println("<--STUDENT FOUND-->");
                s.display();
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("STUDENT NOT FOUND");
        }
    }
    void update()
    {
        System.out.print("ENTER ROLL NO TO UPDATE :");
        int no=sc.nextInt();
        boolean found=false;
        for (Student s : l) {
            if (s.rollnumber == no) {
                System.out.print("ENTER NEW MARK :");
                s.marks=sc.nextInt();
                System.out.println("MARK UPDATED SUCCESSFULLY ");
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("STUDENT NOT FOUND");
        }
    }
    void delete()
    {
        System.out.print("ENTER ROLL NO TO DALETE :");
        int no=sc.nextInt();
        boolean found=false;
        for (Student s : l) {
            if(s.rollnumber == no)
            {
                l.remove(s);
                System.out.println("STUDENT DELETED SUCCESSFULLY");
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("STUDENT NOT FOUND");
        }
    }
}
