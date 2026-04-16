package reverseeachword;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE WORD :");
        String get=sc.nextLine();
        String[] words=get.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sbb=new StringBuilder(words[i]);
            sbb.reverse();
            sb.append(sbb).append(" ");
        }
        System.out.println("OUTPUT :"+sb.toString().trim());
    }
    
}
