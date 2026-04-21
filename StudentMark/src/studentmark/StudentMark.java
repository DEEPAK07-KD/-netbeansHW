package studentmark;

import java.util.Scanner;

public class StudentMark {

    static int[] marks;

    public static void main(String[] args) throws Handling {
        Scanner sc = new Scanner(System.in);
        boolean res = true;
        do {
            System.out.println("<--STUDENT MARK SYSTEM-->");
            System.out.println("1.ENTER STUDENT MARKS");
            System.out.println("2.DISPLAY MARKS");
            System.out.println("3.EXIT");
            System.out.print("CHOOSE YOUR OPTION :");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.print("ENTER THE MARKS OF TOTAL SUBJECT :");
                int ma = sc.nextInt();
                marks = new int[ma];

                for (int i = 0; i < ma; i++) {
                    try {
                        System.out.print("ENETR THE SUBJECT" + " " + (i + 1) + " " + "MARKS :");
                        int m = sc.nextInt();

                        if (m < 0 || m > 100) {
                            throw new IllegalArgumentException("Marks Must Be Between 0 and 100");
                        }
                        marks[i] = m;
                    } catch (IllegalArgumentException er) {
                        System.out.println(er.getMessage());
                        i--;
                    }
                }

            } else if (op == 2) {
                if (marks == null) {
                    System.out.println("NO MARKS IS MARKED");
                } else {
                    System.out.println("STUDENT MARKS");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.println("subject" + (i + 1) + " : " + marks[i]);
                    }
                }
            } else {
                res = false;
            }
        } while (res);
    }

}
