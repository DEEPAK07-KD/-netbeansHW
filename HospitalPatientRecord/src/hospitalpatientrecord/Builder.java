package hospitalpatientrecord;

public  class Builder {
        private PatientRecord p;
        private String patientname;
        private int age;
        private String disease;
        private String doctorName;
        private String roomType;
        private double billAmount;

    public Builder() {
        p=new PatientRecord();
    }

    public Builder setPatientname(String patientname) {
        this.patientname = patientname;
        return this;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public Builder setDisease(String disease) {
        this.disease = disease;
        return this;
    }

    public Builder setDoctorName(String doctorName) {
        this.doctorName = doctorName;
        return this;
    }

    public Builder setRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    public Builder setBillAmount(double billAmount) {
        this.billAmount = billAmount;
        return this;
    }
        public PatientRecord record()
        {
            p.setPatientname(this.patientname);
            p.setAge(this.age);
            p.setDisease(this.disease);
            p.setDoctorName(this.doctorName);
            p.setRoomType(this.roomType);
            p.setBillAmount(this.billAmount);
            return p;
        }
        
}
