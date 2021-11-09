package hw2.chapter4;

public abstract class Shape implements Cloneable{

    private Point point;

    public Shape() {
    }

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void moveBy(double dx, double dy) {
        point.x += dx ;
        point.y += dy;
    }

    public abstract Point getCenter();

    @Override
    public Shape clone()  {
        Shape cloneShape = null;
        try {
            cloneShape = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        cloneShape.point = new Point(getPoint().getX(), getPoint().getY());
        return cloneShape;
    }
}
