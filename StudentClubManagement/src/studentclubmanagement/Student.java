package studentclubmanagement;

public class Student {
        String name;

    public Student(String name) {
        this.name = name;
    }
        void display()
        {
            System.out.println("STUDENT NAME :"+name);
        }
       @Override
       public boolean equals(Object o)
       {
           if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return name.equalsIgnoreCase(s.name); 
       }
        @Override
    public int hashCode() {
        return name.toLowerCase().hashCode(); // must match equals
    }
}
