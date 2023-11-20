package superMyMarket;

import java.util.Arrays;
import java.util.Scanner;

public class Basked extends Product{
    private Product[] productsInBasked = new Product[0];
    private double priceZAKG;
    public Basked() {
    }

    public Basked(Product[] basked) {
        this.productsInBasked = basked;
    }


    public Product[] getProductsInBasked() {
        return productsInBasked;
    }

    public void setProductsInBasked(Product[] productsInBasked) {
        this.productsInBasked = productsInBasked;
    }

    public double getPriceZAKG() {
        return priceZAKG;
    }

    public void setPriceZAKG(double priceZAKG) {
        this.priceZAKG = priceZAKG;
    }

    public Product[] getBasked() {
        return productsInBasked;
    }

    public void setBasked(Product[] basked) {
        this.productsInBasked = basked;
    }

    public Product [] getKarzina(long id, Product[] products) {
        double kg = 0;
        Scanner scanner = new Scanner(System.in);
        Product [] allproducts = Product.getProducts();
        for (int i = 0; i < Product.getProducts().length; i++) {
            if (allproducts[i].getId() == id) {
                System.out.println("Сколька кг хотите купить? ");
                String kgg = scanner.nextLine();
                if (kgg.contains("1") || kgg.contains("2") || kgg.contains("3")||kgg.contains("4")||kgg.contains("5")||kgg.contains("6")||kgg.contains("7")||kgg.contains("8")||kgg.contains("9")||kgg.contains("0")){
                    kg = Double.parseDouble((kgg));
                }else System.out.println("Сколька кг хотите купить? ");
                double price = allproducts[i].getPrice();
                allproducts[i].setPriceZAKG(price*kg);
                products = Arrays.copyOf(products, products.length + 1);
                products[products.length - 1] = allproducts[i];
                allproducts[i].dayar();
            }
        }
        return products;
    }
    public Basked(Product[] productsInBasked, double priceZAKG) {
        this.productsInBasked = productsInBasked;
        this.priceZAKG = priceZAKG;
    }

    public Basked(String productName, double price, int id, Product[] productsInBasked, double priceZAKG) {
        super(productName, price, id,priceZAKG);
        this.productsInBasked = productsInBasked;
        this.priceZAKG = priceZAKG;
    }
}
