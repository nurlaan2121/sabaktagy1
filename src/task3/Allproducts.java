package task3;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Allproducts implements BasketInterface {
    private String name;
    private String discription;
    private double price;
    private LocalDate realiseDate;
    private long shtKg;
    private Products tipProducts;
    private String idProduct;

    public Allproducts() {
    }

    public Allproducts(String name, String discription, double price, LocalDate realiseDate, Products tipProducts, long shtKg, String idProduct) {
        this.name = name;
        this.discription = discription;
        this.price = price;
        this.realiseDate = realiseDate;
        this.tipProducts = tipProducts;
        this.shtKg = shtKg;
        this.idProduct = idProduct;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getRealiseDate() {
        return realiseDate;
    }

    public void setRealiseDate(LocalDate realiseDate) {
        this.realiseDate = realiseDate;
    }

    public Products getTipProducts() {
        return tipProducts;
    }

    public void setTipProducts(Products tipProducts) {
        this.tipProducts = tipProducts;
    }

    public long getShtKg() {
        return shtKg;
    }

    public void setShtKg(long shtKg) {
        this.shtKg = shtKg;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public Allproducts[] setProductinMagazin(Allproducts[] allproducts, Allproducts[] baskeds) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write id product:");
        String id = scanner.nextLine();
        for (int i = 0; i < allproducts.length; i++) {
            if (id.equalsIgnoreCase(allproducts[i].getIdProduct())) {
                System.out.println("Write KG||SHTUK: ");
                long res = scanner.nextInt();
                allproducts[i].setShtKg(res);
                baskeds = Arrays.copyOf(baskeds, baskeds.length + 1);
                baskeds[baskeds.length - 1] = allproducts[i];
                System.out.println("Succes!");
                return baskeds;
            }
        }
        return null;
    }

    @Override
    public Allproducts[] deleteProductinBasket(Allproducts[] baskeds) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write id product for delete:");
        String id = scanner.nextLine();
        for (int i = 0; i < baskeds.length; i++) {
            if (baskeds[i].getIdProduct().equalsIgnoreCase(id)) {
                for (int j = i; j < baskeds.length - 1; j++) {
                    baskeds[j] = baskeds[j + 1];
                }
                return Arrays.copyOf(baskeds, baskeds.length - 1);
            }
        }
        return null;
    }

    @Override
    public Chek[] getChekPrice(Allproducts[] allproducts, Allproducts[] baskeds, Chek[] cheks) {
        for (int i = 0; i < baskeds.length; i++) {
            LocalDate productDate = baskeds[i].getRealiseDate();
            LocalDate currentDate = LocalDate.now();
            Chek chek = new Chek();
            if (baskeds[i].getTipProducts().toString().equalsIgnoreCase("CLOTHES") || baskeds[i].getTipProducts().toString().equalsIgnoreCase("ELECRONICS")) {
                chek.setNameProduct(baskeds[i].getName());
                chek.setBrandName(baskeds[i].getDiscription());
                chek.setTipe(baskeds[i].getTipProducts());
                chek.setDateTime(ZonedDateTime.now());
                chek.setOriginPrice(baskeds[i].getPrice());
                chek.setShuk(baskeds[i].getShtKg());
                long raznisa = ChronoUnit.MONTHS.between(productDate, currentDate);
                System.out.println("CLOTER:" + raznisa);
                if (raznisa > 6) {
                    double discountedPrice = ((baskeds[i].getPrice() * baskeds[i].getShtKg()) * 0.5);
                    chek.setPriceCProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
                    chek.setPriceBezProsent((baskeds[i].getPrice() * baskeds[i].getShtKg()));
                    chek.setPriceOOP(discountedPrice);
                } else {
                    chek.setPriceCProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
                    chek.setPriceBezProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
//                    chek.setPriceOOP(baskeds[i].getPrice() * baskeds[i].getShtKg());
                }
            } else {
                chek.setNameProduct(baskeds[i].getName());
                chek.setBrandName(baskeds[i].getDiscription());
                chek.setTipe(baskeds[i].getTipProducts());
                chek.setDateTime(ZonedDateTime.now());
                chek.setOriginPrice(baskeds[i].getPrice());
                chek.setShuk(baskeds[i].getShtKg());
                long raz = ChronoUnit.DAYS.between(productDate, currentDate);
                System.out.println("MOMO: " + raz);
                if (raz > 10) {
                    double discountedPrice = (baskeds[i].getPrice() * baskeds[i].getShtKg() * 0.7);
                    chek.setPriceCProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
                    chek.setPriceBezProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
                    chek.setPriceOOP(discountedPrice);
                } else {
                    chek.setPriceCProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
                    chek.setPriceBezProsent(baskeds[i].getPrice() * baskeds[i].getShtKg());
                }
            }
            cheks = Arrays.copyOf(cheks, cheks.length + 1);
            cheks[cheks.length - 1] = chek;
        }
        return cheks;
    }


    @Override
    public String toString() {
        return " | ID: " + '"' + idProduct + '"' +
                " | Name: " + '"' + name + '"' +
                " | Discription: " + '"' + discription + '"' +
                " | Price: " + '"' + price + '"' +
                " | Realise Date: " + '"' + realiseDate + '"' +
                " | Tip Products: " + '"' + tipProducts + "\n";
    }


}


