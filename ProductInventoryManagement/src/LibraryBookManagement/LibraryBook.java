package LibraryBookManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LibraryBook {
    Map<Integer, String> m=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    Scanner se=new Scanner(System.in);
    public static void main(String[] args) {
       LibraryBook lb = new LibraryBook();
       lb.main();
    }
    public void main(){
        boolean res=true;
        do {
            System.out.println("<--- Library Book Management System--->");
            System.out.println("1.ADD BOOK");
            System.out.println("2.SEARCH BOOK");
            System.out.println("3.UPDATE BOOK");
            System.out.println("4.DELETE BOOK");
            System.out.println("5.DISPLAY ALL BOOK");
            System.out.println("6.EXIT");
            System.out.print("Enter the value : ");
            int val=sc.nextInt();
            if (val == 1) {
                add();
            }
            else if (val == 2) {
                search();
            }
            else if(val == 3){
                update();
            }
            else if (val == 4) {
                delete();
            }
            else if (val == 5) {
                display();
            }
            else{
                res=false;
            }
            
        } while (res);
    }
    
    public void add(){
        System.out.print("Enter Book ID : ");
       int id= se.nextInt();
        
        System.out.print("Enter Book Name : ");
        sc.nextLine();
        String name = sc.nextLine();
        
        
        m.put(id, name);
        
        System.out.println("Book Added Successfully");
    }
    
    public void search(){
        System.out.print("Enter Book ID : ");
        int id = se.nextInt();
        
        if (m.containsKey(id)) {
            System.out.println("ID : "+ id);
            System.out.println("Name : "+m.get(id));
        } else{
            System.out.println("Book Not Found");
        }
    }
    
    public void update(){
        System.out.print("Enter Book ID : ");
        int id = se.nextInt();
        
        if (m.containsKey(id)) {
            System.out.print("Enter New Book Name : ");
            sc.nextLine();
            String name = sc.nextLine();
            
            m.put(id, name);
            System.out.println("Book Name Updated Successfully");
        } else{
            System.out.println("Book Not Found");
        }
    }
    
    public void delete(){
        System.out.print("Enter Book ID : ");
        int id = se.nextInt();
        
        if (m.containsKey(id)) {
            m.remove(id);
            System.out.println("Book Deleted Successfully");
        } else{
            System.out.println("Book Not Found");
        }
    }
    
    public void display(){
        if (m.isEmpty()) {
            System.out.println("No Book Available");
        }
        else{
            System.out.println("\n--- ALL Books ---");
            
            for (Map.Entry<Integer, String> entry : m.entrySet()) {
                System.out.println(entry.getKey() + " : "+ entry.getValue());
            }
        }
    }
}
