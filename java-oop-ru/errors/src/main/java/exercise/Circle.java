package exercise;

// BEGIN
public class Circle {
    private int radius;
    private Point point;
    private final double PI = Math.PI;

    public Circle(Point point, int radius) {
        this.radius = radius;
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("Radius is a negative number");
        } else {
            return radius * radius * PI;
        }
    }
}
// END
