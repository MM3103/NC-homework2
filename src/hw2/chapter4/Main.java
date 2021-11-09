package hw2.chapter4;

public class Main {
    public static void main(String[] args) {

     Point point = new Point(1,1);
     Circle circle = new Circle(point,5);
     Rectangle rectangle = new Rectangle(point, 5,10);
     Line line = new Line(point, new Point(10,10));

     Circle circle1 = circle.clone();
    }
}
