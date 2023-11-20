package superMyMarket;

public class Product {
    private String productName;
    private double price;
    private int Id;
    private double priceZAKG;

    public Product() {
    }

    public Product(String productName, double price, int id,double priceZAKG) {
        this.productName = productName;
        this.price = price;
        this.Id = id;
        this.priceZAKG = priceZAKG;
    }

    public double getPriceZAKG() {
        return priceZAKG;
    }

    public void setPriceZAKG(double priceZAKG) {
        this.priceZAKG = priceZAKG;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Продукт{" +
                "Имя продукта ='" + productName + '\'' +
                ", Цена на кг:=" + price +
                ", Id=" + Id + "\n";
    }
    public void dayar() {
        System.out.println("Продукт{" +
                "Имя продукта ='" + productName + '\'' +
                ", Цена на  кг=" + price +
                ", Цена =" + priceZAKG +
                ", Id=" + Id + "\n");
    }

    public static Product[] getProducts() {

        Product product = new Product("Картошко", 35, 1,0);
        Product product1 = new Product("Памодор", 50, 2,0);
        Product product2 = new Product("Пияз", 25, 3,0);
        Product product3 = new Product("Бадыран", 40, 4,0);
        Product product4 = new Product("Туз", 50, 5,0);
        Product product5 = new Product("Сабиз", 15, 6,0);
        Product product6 = new Product("Сарымсак", 15, 7,0);
        Product product7 = new Product("Ун", 75, 8,0);
        Product product8 = new Product("Дарбыз", 20, 9,0);
        Product product9 = new Product("Коон", 35, 10,0);

        return new Product[]{product, product1, product2, product3, product4, product5, product6, product7, product8, product9};
    }

}
