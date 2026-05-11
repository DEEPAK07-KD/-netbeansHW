package hospitalpatientrecord;

import java.util.Scanner;


public class HospitalPatientRecord {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER PATIENT NAME :");
        String name=sc.next();
        System.out.print("ENTER PATIENT AGE :");
        int age=sc.nextInt();
        System.out.print("ENTER DISEASE :");
        String dis=sc.next();
        System.out.print("ENTER DOCTOR NAME :");
        String doc=sc.next();
        System.out.print("ENTER THE ROOM TYPE :");
        String room=sc.next();
        System.out.print("ENTER BILL AMOUNT :");
        double bill=sc.nextDouble();
        PatientRecord pr=new Builder().setAge(age ).setBillAmount(bill).setDisease(dis).setDoctorName(doc).setPatientname(name).setRoomType(room).record();
        pr.display();
    }
    
}
