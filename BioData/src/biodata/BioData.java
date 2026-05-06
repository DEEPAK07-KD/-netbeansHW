package biodata;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BioData {
    Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
       BioData b=new BioData();
       b.main();
       
    }
    void main() throws IOException
    {
        File f=new File("C:\\Users\\ELCOT\\Desktop\\FileHandling\\biodata.txt");
        f.createNewFile();
        
        System.out.print("NAME :");
        String name=sc.next();
        System.out.print("AGE :");
        int age=sc.nextInt();
        System.out.print("GENDER :");
        String gender=sc.next();
        System.out.print("DOB :");
        String dob=sc.next();
        System.out.print("BLOOD GROUP :");
        String bloodgroup=sc.next();
        System.out.print("QUALIFICATION :");
        String qualification=sc.next();
        System.out.print("COLLEGE NAME :");
        String college=sc.next();
        System.out.print("PERCENTAGE/CGPA :");
        double CGPA=sc.nextDouble();
        System.out.print("SKILLS :");
        String skills=sc.next();
        System.out.print("EXPERIENCE(IN YEAR) :");
        String experience=sc.next();
        System.out.print("PHONE NUMBER :");
        String phoneno=sc.next();
        System.out.print("EMAIL ID :");
        String email=sc.next();
        System.out.print("ADDRESS :");
        String address=sc.next();
        System.out.print("FATHER NAME :");
        String fathername=sc.next();
        System.out.print("MOTHER NAME :");
        String mothername=sc.next();
        FileWriter w=new FileWriter(f,true);
            w.write("=======BIO DATA=======");
            w.write("\n<--PERSONAL DETAILS-->");
            w.write("\nName :"+name);
            w.write("\nAge :"+age);
            w.write("\nGender :"+gender);
            w.write("\nDOB :"+dob);
            w.write("\nBlood Group :"+bloodgroup+"\n\n");
            w.write("\n<--EADUCATION-->");
            w.write("\nQualification :"+qualification);
            w.write("\nCollege :"+college);
            w.write("\nCGPA :"+CGPA+"\n\n");
            w.write("\n<--SKILLS-->");
            w.write("\n"+skills);
            w.write("\nExperience :"+experience+"\n\n");
            w.write("\n<--CONTACT-->");
            w.write("\nPhone No :"+phoneno);
            w.write("\nEmail :"+email);
            w.write("\nAddress :"+address+"\n\n");
            w.write("\n<--FAMILY-->");
            w.write("\nFather Name :"+fathername);
            w.write("\nMother Name :"+mothername);
            w.close();
            
    }
}
