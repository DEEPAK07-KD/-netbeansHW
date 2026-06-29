package leetcode;

import java.util.Scanner;

public class TwoSum {

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
                if (ar[i] + ar[j]==tar) {
                    System.out.print(i+", "+j);
                    found=true;
                    break;
                }
            }
        }
        if(!found)
            System.out.println("No Solution");
    }
    //        for (int i = 0; i < ar.length; i++) {
//        int left=i+1;
//        int right=ar.length-1;
//        while(left<right)
//        {
//            int sum=ar[i]+ar[right];
//            if (sum==tar) {
//                System.out.print(ar[i]+", "+ar[right]);
//                return;
//            }
//            else if (sum<tar) {
//                left++;
//            }
//            else
//            {
//                right--;
//            }
//        }
//        }
//    }
}
