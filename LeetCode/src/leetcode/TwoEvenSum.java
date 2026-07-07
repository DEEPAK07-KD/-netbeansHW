package leetcode;

import java.util.Scanner;


public class TwoEvenSum {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter the "+i+"th index value : ");
            ar[i]=sc.nextInt();
        }
        System.out.print("Set Target : ");
        int set=sc.nextInt();
        main(ar, set);
    }
        public static void main(int ar[],int tar)
        {
            
           boolean found=false;
            for (int i = 0; i < ar.length; i++) {
                for (int j = i+1; j < ar.length; j++) {
                    if ((i%2==0) && (j%2==0)) {
                        if (ar[i]+ar[j]==tar) {
                             System.out.println(i+","+j);
                            found=true;
                            break;
                        } 
                    }
                }
            }
            if (!found) {
                System.out.println("No Solution");
            }
        }
}
