public class Car {
    @MyAnnotaion
    private Engin engin;

    public void drive(){
        engin.start();
        System.out.println("Car Is Running");
    }
}
