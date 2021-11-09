package hw2.chapter2;

public class Point {

    public double x;
    public double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translate(double dx, double dy){
        return new Point(this.x+dx,this.y+dy);
    }

    public Point scale(double sc){
        return new Point(this.x*sc,this.y*sc);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
