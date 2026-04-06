
package areacs;

public class Square extends Shape {
 Square(double value)
    {
        super(value);
    }
    @Override
    void calculateArea() {
        double area=value*value;
        System.out.println("AREA OF SQUARE :"+area);
    }

}
