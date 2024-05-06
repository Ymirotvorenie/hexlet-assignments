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

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }
        return this.getArea() > another.getArea() ? 1 : -1;
    }

    @Override
    public String toString() {
        return String.format("Квартира площадью %s метров на %s этаже", getArea(), this.floor);
    }
}
// END
