public class UchBurchtuk extends Shape{
    private int birinchiJagy;
    private int ekinchiJagy;
    private int uchunchuJagy;

    public UchBurchtuk(int birinchiJagy, int ekinchiJagy, int uchunchuJagy) {
        this.birinchiJagy = birinchiJagy;
        this.ekinchiJagy = ekinchiJagy;
        this.uchunchuJagy = uchunchuJagy;
    }

    @Override
    public double getPerimeter() {
        return birinchiJagy + ekinchiJagy + uchunchuJagy;
    }
}