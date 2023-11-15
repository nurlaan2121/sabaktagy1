public class TikBurchtuk extends Shape{
    private int birinchiJagy;
    private int ekinchiJagy;
    private int uchunchuJagy;
    private int tortunchuJay;

    public TikBurchtuk(int birinchiJagy, int ekinchiJagy, int uchunchuJagy, int tortunchuJay) {
        this.birinchiJagy = birinchiJagy;
        this.ekinchiJagy = ekinchiJagy;
        this.uchunchuJagy = uchunchuJagy;
        this.tortunchuJay = tortunchuJay;
    }

    @Override
    public double getPerimeter() {
        return birinchiJagy + ekinchiJagy + uchunchuJagy + tortunchuJay;
    }
}