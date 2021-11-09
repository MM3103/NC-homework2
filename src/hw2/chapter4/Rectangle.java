package hw2.chapter4;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point downLeft, double width, double height) {
        super(downLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getPoint().getX() + width / 2, getPoint().getY() + height / 2);
    }

    @Override
    public Rectangle clone()  {
        Rectangle cloneRectangle = (Rectangle) super.clone();
        cloneRectangle.width = width;
        cloneRectangle.height = height;
        return cloneRectangle;
    }
}
