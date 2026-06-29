
package markadaptor;

public class Adaptor implements GradSystem{
    private OldMarkSystem ms;

    public Adaptor(OldMarkSystem ms) {
        this.ms = ms;
    }

    @Override
    public String grade() {
        int m=ms.totalmark();
        if (m>=90) {
            return "A";
        }
        else if (m>=80) {
            return "B";
        }
        else if (m>=70) {
            return "C";
        }
        else if (m>=60) {
            return "D";
        }
        else
        {
            return "F";
        }
    }
    
}
