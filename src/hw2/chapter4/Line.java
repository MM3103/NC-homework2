package hw2.chapter4;

public class Line extends Shape {

    Point end;

    public Line(Point start, Point end) {
        super(start);
        this.end = end;
    }

    @Override
    public Point getCenter() {
        return new Point((end.getX() - getPoint().getX()) / 2,(end.getY() - getPoint().getY()) / 2);
    }

    @Override
    public Line clone()  {
        Line cloneLine = (Line) super.clone();
        cloneLine.end = new Point(end.getX(), end.getY());
        return cloneLine;
    }
}
