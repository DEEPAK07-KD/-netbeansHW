
package areacs;

public class Circle extends Shape {
Circle(double value)
    {
        super(value);
    }
    @Override
    void calculateArea() {
        double area=3.14*value*value;
      System.out.println("AREA OF CIRCLE :"+area);
    }

}
