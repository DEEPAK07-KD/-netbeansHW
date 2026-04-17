package collegestudentfeesystem;

import java.util.Scanner;

public class CollegeStudentFeeSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter College Name: ");
        College.collegeName = sc.nextLine();

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        College[] students = new College[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter fee for student " + (i + 1) + ": ");
            double fee = sc.nextDouble();
            students[i] = new College(fee);
        }

        
        College.displayCollegeDetails();

        for (int i = 0; i < n; i++) {
            students[i].displayStudentFee();
        }
    }
}

