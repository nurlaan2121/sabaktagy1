public class Tegerek extends Shape{
    private int radius;

    public Tegerek(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.round(2 * Math.PI * radius);
    }
}