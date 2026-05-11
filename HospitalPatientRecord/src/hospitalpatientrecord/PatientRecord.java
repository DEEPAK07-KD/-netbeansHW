package hospitalpatientrecord;

public class PatientRecord {
        private String patientname;
        private int age;
        private String disease;
        private String doctorName;
        private String roomType;
        private double billAmount;

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
        @Override
       public String toString()
       {
           return patientname+age+disease+doctorName+roomType+billAmount;
       }
       public void display()
       {
        System.out.println("----- Patient Record -----");
        System.out.println("Patient Name : " + patientname);
        System.out.println("Age          : " + age);
        System.out.println("Disease      : " + disease);
        System.out.println("Doctor Name  : " + doctorName);
        System.out.println("Room Type    : " + roomType);
        System.out.println("Bill Amount  : " + billAmount);
       }
}
