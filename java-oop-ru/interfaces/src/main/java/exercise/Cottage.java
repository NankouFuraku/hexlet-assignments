package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCounting;

    public Cottage(double area, int floorCounting) {
        this.area = area;
        this.floorCounting = floorCounting;
    }

    public double getArea() {
        return area;
    }

    public int compareTo(Home another) {
        if (area == another.getArea()) {
            return 0;
        }
        return area > another.getArea() ? 1 : -1;
    }

    public String toString() {
        return floorCounting + " этажный коттедж площадью " + area + " метров";
    }
}
// END
