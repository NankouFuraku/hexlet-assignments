package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public int compareTo(Home another) {
        if (area + balconyArea == another.getArea()) {
            return 0;
        }
        return (area + balconyArea) > another.getArea() ? 1 : -1;
    }

    public String toString() {
        return "Квартира площадью " + (area + balconyArea) + " метров на " + floor +" этаже";
    }
}
// END
