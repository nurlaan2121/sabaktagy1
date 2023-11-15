public class Main {
    public static void main(String[] args) {
        Shape tegerek = new Tegerek(5);
        Shape kvadart = new Kvadrat(2, 4);
        Shape tikBurchtuk = new TikBurchtuk(3, 5, 5, 3);
        Shape uchBurchtuk = new UchBurchtuk(8, 8, 5);
        Shape romb = new Romb(2,5);


        System.out.println("PERIMETR: ");
        System.out.println("Tegerek: " + tegerek.getPerimeter());
        System.out.println("Kvadrat: " + kvadart.getPerimeter());
        System.out.println("Tik burchtuk: " + tikBurchtuk.getPerimeter());
        System.out.println("Uch burchtuk: " + uchBurchtuk.getPerimeter());
        System.out.println("Romb: " + romb.getPerimeter());
    }
}