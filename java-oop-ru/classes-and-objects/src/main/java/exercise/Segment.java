package exercise;

// BEGIN
public class Segment {
    private Point point1;
    private Point point2;

    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getMidPoint() {
        var midX = (point1.getX() + point2.getX()) / 2;
        var midY = (point1.getY() + point2.getY()) / 2;

        return new Point(midX, midY);
    }

    public Point getBeginPoint() {
        return point1;
    }

    public Point getEndPoint() {
        return point2;
    }
}
// END
