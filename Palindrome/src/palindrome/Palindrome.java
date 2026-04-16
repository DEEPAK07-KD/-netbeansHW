package palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE WORD :");
        String wor=sc.nextLine();
        String r="";
        for (int i = wor.length()-1; i >= 0; i--) {
            r=r+wor.charAt(i);
        }
        if(wor.equals(r))
        {
            System.out.println(wor+"->IS TEH PALINDROME");
        }
        else
        {
            System.out.println(wor+"->IS NOT A PALINDROME");
        }
    }
    
}
