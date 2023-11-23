package task3;

import java.time.LocalDate;
import java.util.Arrays;

public class BAZADANNYH{
    Allproducts allproducts = new Allproducts("Банан", "Африканский", 280, LocalDate.of(2023, 11, 10), Products.VEGITABLES, 0, "1");
    Allproducts allproducts2 = new Allproducts("Алма", "Кок алма", 40, LocalDate.of(2023, 11, 18), Products.VEGITABLES, 0, "2");
    Allproducts allproducts3 = new Allproducts("Ун", "1-сорт", 60, LocalDate.of(2023, 11, 20), Products.VEGITABLES, 0, "3");

    Allproducts allproducts4 = new Allproducts("Airpods", "m5", 1800, LocalDate.of(2023, 9, 20), Products.ELECRONICS, 0, "4");
    Allproducts allproducts5 = new Allproducts("Мышка", "m1", 500, LocalDate.of(2023, 3, 20), Products.ELECRONICS, 0, "5");
    Allproducts allproducts6 = new Allproducts("Ноутбук", "HP", 30000, LocalDate.of(2023, 2, 20), Products.ELECRONICS, 0, "6");

    Allproducts allproducts7 = new Allproducts("Калпак", "Кийиз калпак", 1000, LocalDate.of(2023, 7, 20), Products.CLOTHES, 0, "7");
    Allproducts allproducts8 = new Allproducts("Джинсы", "Кок шым", 1200, LocalDate.of(2023, 2, 20), Products.CLOTHES, 0, "8");
    Allproducts allproducts9 = new Allproducts("Байпак", "Пайпак", 300, LocalDate.of(2023, 5, 20), Products.CLOTHES, 0, "9");
    Allproducts[] getAllProducts = {allproducts, allproducts2, allproducts3, allproducts4, allproducts5, allproducts6, allproducts7, allproducts8, allproducts9};

    public void printAllProducts() {
        System.out.println("All products: \n" + Arrays.toString(getAllProducts) + "\n");
    }

    public Allproducts[] getmyProduct() {
        return getAllProducts;
    }

    @Override
    public String toString() {
        return "BAZADANNYH{" +
                "allproducts=" + allproducts +
                ", allproducts2=" + allproducts2 +
                ", allproducts3=" + allproducts3 +
                ", allproducts4=" + allproducts4 +
                ", allproducts5=" + allproducts5 +
                ", allproducts6=" + allproducts6 +
                ", allproducts7=" + allproducts7 +
                ", allproducts8=" + allproducts8 +
                ", allproducts9=" + allproducts9 +
                ", getAllProducts=" + Arrays.toString(getAllProducts) +
                '}';
    }

}
