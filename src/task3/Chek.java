package task3;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.StringTemplate.STR;

public class Chek extends BAZADANNYH{
    private String nameProduct;
    private String brandName;
    private double priceOOP;
    private double priceCProsent;
    private double priceBezProsent;
    private ZonedDateTime dateTime;
    private Products Tipe;
    private double originPrice;
    private long shuk;

    public Chek() {
    }

    public Chek(String nameProduct, String brandName, double priceOOP, double priceCProsent, double priceBezProsent, ZonedDateTime dateTime, Products tipe) {
        this.nameProduct = nameProduct;
        this.brandName = brandName;
        this.priceOOP = priceOOP;
        this.priceCProsent = priceCProsent;
        this.priceBezProsent = priceBezProsent;
        this.dateTime = dateTime;
        Tipe = tipe;
    }

    public double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(double originPrice) {
        this.originPrice = originPrice;
    }

    public long getShuk() {
        return shuk;
    }

    public void setShuk(long shuk) {
        this.shuk = shuk;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPriceOOP() {
        return priceOOP;
    }

    public void setPriceOOP(double priceOOP) {
        this.priceOOP = priceOOP;
    }

    public double getPriceCProsent() {
        return priceCProsent;
    }

    public void setPriceCProsent(double priceCProsent) {
        this.priceCProsent = priceCProsent;
    }

    public double getPriceBezProsent() {
        return priceBezProsent;
    }

    public void setPriceBezProsent(double priceBezProsent) {
        this.priceBezProsent = priceBezProsent;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Products getTipe() {
        return Tipe;
    }

    public void setTipe(Products tipe) {
        Tipe = tipe;
    }

    @Override
    public void printAllProducts() {
        super.printAllProducts();
    }

    @Override
    public Allproducts[] getmyProduct() {
        return super.getmyProduct();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printChek(Chek[] cheks) {
        for (int i = 0; i < cheks.length; i++) {
            System.out.println(STR."Chek : " +
                    "Name Product: " + '"'+ cheks[i].getNameProduct() + '"' +
                    "BrandName: " + '"'+ cheks[i].getBrandName() + '"' +
                    "Обшая цена: " + '"'+ cheks[i].getPriceOOP() + '"' +
                    "Цена с скидками: " + '"'+ cheks[i].getPriceCProsent() +'"'+
                    "Цена без скидки: " + '"'+ cheks[i].getPriceBezProsent() +'"'+
                    "Date Time: " + '"' + cheks[i].getDateTime() +'"'+
                    "Origin price: " + '"' + cheks[i].getOriginPrice() +
                    "Kg||Shuk : " + '"' + cheks[i].getShuk() +
                    "Tipe: " + '"'+ cheks[i].getTipe() + "\n");

        }

    }
    public void print2(Chek [] cheks,long counter){
        long res = 0;
        long skidka = 0;
        int counterForNumberProd = 1;
        ZonedDateTime dateTime = ZonedDateTime.now();
        DateTimeFormatter men2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nne = dateTime.format(men2);
        System.out.println("*-------------------------------------------------------------------------------------------------------------------*\n" +
                "|                                   Адрес:\"Абсамат Масалиев\" Супер маркет:\"Ак-Ниет\" №5-Касса                         |");
        for (int i = 0; i < cheks.length; i++) {
            res += (long) (cheks[i].getPriceBezProsent() - cheks[i].getPriceOOP());
            skidka += (long) cheks[i].getPriceOOP();
            if (cheks[i].getTipe().equals(Products.VEGITABLES)){
                System.out.print(STR. """
                   |  \{counterForNumberProd++})Название: \{cheks[i].getNameProduct()} | Описание: \{cheks[i].getBrandName()} |Цена: \{cheks[i].getOriginPrice()}  |  Кг:\{cheks[i].getShuk()} | Скидка: \{cheks[i].getPriceOOP()}сом |Сумма без скидки:\{cheks[i].getPriceCProsent()} Сумма : \{(cheks[i].getPriceBezProsent() - cheks[i].getPriceOOP())}сом  |\n""");
            }else {
                System.out.print(STR. """
                   |  \{counterForNumberProd++})Название: \{cheks[i].getNameProduct()} | Описание: \{cheks[i].getBrandName()} |Цена: \{cheks[i].getOriginPrice()}  |  Шт:\{cheks[i].getShuk()} | Скидка: \{cheks[i].getPriceOOP()}сом |Сумма без скидки:\{cheks[i].getPriceCProsent()} Сумма : \{(cheks[i].getPriceBezProsent() - cheks[i].getPriceOOP())}сом  |\n """);
            }
        }
        System.out.println("|                    Итог к оплате: " + res + "   | Oбщие скидки: " + skidka + " |  № чека:" + counter + " | Дата: " + nne + "                |");
        System.out.println("|                                  ***********   Спасибо за покупки!  *********                                       |");
        System.out.println("*-------------------------------------------------------------------------------------------------------------------*\n");
    }
}
