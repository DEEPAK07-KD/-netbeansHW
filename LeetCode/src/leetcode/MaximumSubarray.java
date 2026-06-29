
package leetcode;

import java.util.Scanner;


public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size=sc.nextInt();
        int ar[]=new int[size];
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Enter the "+i+"th index value : ");
            ar[i]=sc.nextInt();
        }
        main(ar);
    }
    public static void main(int ar[])
    {
        int max=0;
        for (int i = 0; i < ar.length; i++) {
            int sum=0;
            for (int j = i; j < ar.length; j++) {
                sum=sum+ar[j];
                
                if (sum>max) {
                    System.out.println(max=sum);
                }
            }
        }
        System.out.println("Maximum "+max);
    }
}
