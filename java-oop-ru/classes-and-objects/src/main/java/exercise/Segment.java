package exercise;

// BEGIN
public class Segment {
    private Point pointA;
    private Point pointB;

    public Segment(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getBeginPoint() {
        return pointA;
    }

    public Point getEndPoint() {
        return pointB;
    }

    public Point getMidPoint() {
        int midX = (pointA.getX() + pointB.getX()) / 2;
        int midY = (pointA.getY() + pointB.getY()) / 2;
        return new Point(midX, midY);
    }
}
// END
