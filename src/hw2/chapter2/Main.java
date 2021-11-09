package hw2.chapter2;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(point);

        Car car = new Car(0,1000,10);
        System.out.println(car.maxDistance());
        System.out.println(car.getCurrentDistance());
        System.out.println(car.getFuelLevel());
        car.drive(11000);
        System.out.println(car.maxDistance());
        System.out.println(car.getCurrentDistance());
        System.out.println(car.getFuelLevel());
        System.out.println(car);
        car.drive(100);
        System.out.println(car.maxDistance());
        System.out.println(car.getCurrentDistance());
        System.out.println(car.getFuelLevel());
        System.out.println(car);

    }
}
