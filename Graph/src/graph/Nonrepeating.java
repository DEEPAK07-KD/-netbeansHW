package graph;

import java.util.Scanner;

public class Nonrepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("String : ");
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
    
}
