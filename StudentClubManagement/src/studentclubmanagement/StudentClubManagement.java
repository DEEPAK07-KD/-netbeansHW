package studentclubmanagement;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentClubManagement {
    Scanner sc=new Scanner(System.in);
        Set<Student> s=new LinkedHashSet<>();
    public static void main(String[] args) {
        StudentClubManagement scm=new StudentClubManagement();
        scm.main();
    }
    void main()
    {
        boolean res=true;
        do
        {
            System.out.println("<--STUIDENT CLUB MANAGEMENT-->");
            System.out.println("1.ADD MEMBERS");
            System.out.println("2.REMOVE MEMBER");
            System.out.println("3.SEARCH MEMBER");
            System.out.println("4.DISPLAY ALL MEMBERS");
            System.out.println("5.COUNT MEMBERS");
            System.out.println("6.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
                add();
            }
            else if(op==2)
            {
                remove();
            }
            else if(op==3)
            {
                search();
            }
            else if(op==4)
            {
                display();
            }
            else if(op==5)
            {
                count();
            }
            else
            {
                res=false;
            }
        }while(res);
       
    }
     void add()
    {
        System.out.print("ENTER STUDENT NAME :");
        String name=sc.next();
        Student st=new Student(name);
        if(s.add(st))
        {
            System.out.println("STUDENT ADDED");
        }
        else
        {
            System.out.println("STUDENT ALREADY EXITS");
        }
    }
     void remove()
     {
         System.out.print("ENTER REMOVE STUDENT NAME :");
         String name=sc.next();
         Student st=new Student(name);
         if(s.remove(st))
         {
             System.out.println("STUDENT REMOVED SUCCESSFULLY");
         }
         else
         {
             System.out.println("STUDENT NOT FOUND");
         }
     }
     void search()
     {
         System.out.print("ENTER SEARCH STUDENT NAME :");
         String n=sc.next();
         Student temp=new Student(n);
         
             if(s.contains(temp))
             {
                 System.out.println("STUDENT FOUND");
                 //st.display();
             }
             else
             {
                 System.out.println("STUDENT NOT FOUND");
             }
         }
     
     void display()
     {
         if(s.isEmpty())
         {
             System.out.println("NO MEMBER FOUND");
         }
         else
         {
         for (Student sr : s) {
             sr.display();
         }
     }}
     void count()
     {
         System.out.println("TOTAL MEMBER :"+s.size());
//         int count=0;
//         for (Student stud : s) {
//             count++;
//         }
//         System.out.println(count);
     }
     
}
