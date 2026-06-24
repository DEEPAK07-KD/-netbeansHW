
package jdbc3;


public class Model {
    private int id;
    private String name,course,email;
    private double fees;

    public Model(int id, String name, String course, String email, double fees) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.email = email;
        this.fees = fees;
    }

    public Model() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
    
}
