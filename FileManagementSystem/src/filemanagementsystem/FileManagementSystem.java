package filemanagementsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class FileManagementSystem {
    Scanner sc=new Scanner(System.in);
    //File f=new File("C:\\Users\\ELCOT\\Desktop\\FileHandling\\student.txt");
    File f1;
    public static void main(String[] args) throws IOException {
        FileManagementSystem fms=new FileManagementSystem();
        fms.main();
    }
    void main() throws IOException
    {
        boolean res=true;
        do
        {
            System.out.println("<--FILE MANAGEMENT SYSTEM-->");
            System.out.println("1.WRITE DATA");
            System.out.println("2.READ DATA");
            System.out.println("3.APPEND DATA");
            System.out.println("4.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op=sc.nextInt();
            if(op==1)
            {
               write(); 
            }
            else if(op==2)
            {
                read();
            }
            else if(op==3)
            {
                append();
            }
            else
            {
                res=false;
            }
        }while(res);
    }
    void write() throws IOException 
    {
        System.out.print("ENTER FILE NAME :");
        sc.nextLine();
        String na=sc.nextLine();
        f1=new File("C:\\Users\\ELCOT\\Desktop\\FileHandling\\"+na+".txt");
        f1.createNewFile();
        FileWriter w=new FileWriter(f1,true);
        System.out.println("WRITE THE DATA INTO THE FILE :");
        sc.nextLine();
        String wr=sc.nextLine();
       
        w.write(wr);
        w.close();
    }
    void read() throws FileNotFoundException, IOException
    {
        System.out.print("ENTER FILE NAME :");
        sc.nextLine();
        String n=sc.nextLine();
        File f2=new File("C:\\Users\\ELCOT\\Desktop\\FileHandling\\"+n+".txt");
        if(!f2.exists())
        {
            System.out.println("FILE DOES NOT EXITS");
            return;
        }
        FileReader r=new FileReader(f2);
        Scanner s=new Scanner(r);
        while(s.hasNext())
        {
            String data=s.nextLine();
            System.out.println(data);
        }
        r.close();
    }
    void append() throws IOException
    {
        System.out.print("ENTER FILE NAME :");
        sc.nextLine();
        String nm=sc.nextLine();
        File f3=new File("C:\\Users\\ELCOT\\Desktop\\FileHandling\\"+nm+".txt");
        FileWriter fw=new FileWriter(f3,true);
        System.out.println("WRITE DATA INTO THE FILE :");
        sc.nextLine();
        String nw=sc.nextLine();
        
        fw.write(nw);
        fw.write(System.lineSeparator());
        fw.close();
    }
}
