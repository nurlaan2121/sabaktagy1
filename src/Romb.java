
public class Romb extends Shape {
    private int birinchiJagy;
    private int ekinchiJagy;

    public Romb(int birinchiJagy, int ekinchiJagy) {
        this.birinchiJagy = birinchiJagy;
        this.ekinchiJagy = ekinchiJagy;
    }

    @Override
    public double getPerimeter() {
        return 2 * (birinchiJagy + ekinchiJagy);
    }
}
