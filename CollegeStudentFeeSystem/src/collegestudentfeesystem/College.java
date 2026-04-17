package collegestudentfeesystem;

public class College {
        
    static String collegeName;

    final double registrationFee;
    static int totalStudents = 0;

    
    College(double registrationFee) {
        this.registrationFee = registrationFee;
        totalStudents++;
    }

    static void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentFee() {
        System.out.println("Student Registration Fee: " + registrationFee);
    }
}
