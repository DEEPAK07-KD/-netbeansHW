package pkgmatrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE ROW :");
        int r=sc.nextInt();
        System.out.print("ENTER THE COLUMN :");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]=sc.nextInt();
            }
        }
//        int a[][]={{5,4},{1,2,3,4},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;
        while(top<=bottom && left<=right)
        {
            for (int i = left; i <= right; i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right]+" ");
            }
            right--;
            if(top <= bottom)
            {
            for (int i = right; i >= left; i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            }
            if(left <= right){
            for (int i = bottom; i >= top; i--) {
                System.out.print(a[i][left]+" ");
            }
            left++; 
            }
        }
        
       
    }
    
}
