package atudentmanagementsystem;

public class Student {
        int rollnumber;
        String name;
        int age;
        String course;
        int marks;
        public Student()
        {
            this.age=age;
            this.course=course;
            this.marks=marks;
            this.name=name;
            this.rollnumber=rollnumber;
        }
        void display()
        {
            System.out.println("STUDENT NAME :"+name);
            System.out.println("STUDENT ROLL NUMBER :"+rollnumber);
            System.out.println("STUDENT AGE :"+age);
            System.out.println("COURSE :"+course);
            System.out.println("MARKS :"+marks);
        }
        
}
