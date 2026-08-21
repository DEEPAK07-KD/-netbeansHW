
package MovieRatingManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieRating {
    Map<String, Double> m=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    Scanner se=new Scanner(System.in);
    public static void main(String[] args) {
       MovieRating mr=new MovieRating();
       mr.main();
    }
    public void main(){
        boolean res=true;
        do {
            System.out.println("<---Movie Rating Management System--->");
            System.out.println("1.ADD MOVIE");
            System.out.println("2.SEARCH MOVIE");
            System.out.println("3.UPDATE RATING");
            System.out.println("4.DELETE MOVIE");
            System.out.println("5.DISPLAY ALL MOVIE");
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
        System.out.print("Enter Movie Name : ");
        String name = se.nextLine();
        
        System.out.print("Enter Rating : ");
        double rating = sc.nextDouble();
        
        m.put(name, rating);
        
        System.out.println("Movie Added Successfully");
    }
    
    public void search(){
        System.out.print("Enter Movie Name : ");
        String name = se.nextLine();
        
        if (m.containsKey(name)) {
            System.out.println("Movie : "+ name);
            System.out.println("Rating : "+m.get(name));
        } else{
            System.out.println("Movie Not Found");
        }
    }
    
    public void update(){
        System.out.print("Enter Movie Name : ");
        String name = se.nextLine();
        
        if (m.containsKey(name)) {
            System.out.print("Enter New Rating : ");
            double rating = sc.nextDouble();
            
            m.put(name, rating);
            System.out.println("Rating Updated Successfully");
        } else{
            System.out.println("Movie Not Found");
        }
    }
    
    public void delete(){
        System.out.print("Enter Movie Name : ");
        String name = se.nextLine();
        
        if (m.containsKey(name)) {
            m.remove(name);
            System.out.println("Movie Deleted Successfully");
        } else{
            System.out.println("Movie Not Found");
        }
    }
    
    public void display(){
        if (m.isEmpty()) {
            System.out.println("No Movie Available");
        }
        else{
            System.out.println("\n--- ALL Movie ---");
            
            for (Map.Entry<String, Double> entry : m.entrySet()) {
                System.out.println(entry.getKey() + " : "+ entry.getValue());
            }
        }
    }
}
