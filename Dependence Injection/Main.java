public class Main {

    public static void main(String[] args) {
        Car car=Container.createObject(Car.class);
        car.drive();
    }
}