//Элестетиниз сиз бир чон соода уйуно келдиниз(торговый
//        центр). Сиз каалаган нерсени(product) алып анан кассадан
//        акчасын толоп чыгып кетесиз. Сизде продукт деген нерсе
//        болот анын аты, сүрөттөмө(description), баасы, качан
//        жасалганы болот жана ар бир продуктун тиби(enum) болот
//        (clothes, electronics, vegetables). Жана продуктту сала турган
//        корзина(Basket) болот ичинде коп продуктар болот.
//        BasketInterface болот, ал жерде корзинага продукту кошуу
//        жана продукту алып салуу жана корзинанын ичиндеги
//        баардык продуктардын суммасына чек чыгаруу(бугунку
//        дата мн иштелет), продуктарга чек чыгарып жатканда
//        продуктун тиби Vegetables деген 10 кундон ашып кетсе 70%
//        арзандатуу болсун, clothes менен electronics 6 айдан ашып
//        кетсе 50% арзандатуу болсун, чекте ар бир продуктун аты
//        тушуна толук баасы, эгерде арзандатуусу бар болсо канча
//        % экенин жана арзандатуудан кийинки баасы канча болду
//        чогу болсун, общий сумма чыгып жатканда биринчи
//        арзандатуусуз канча сом экенин, анан арзандатуу мн
//        канча сом болду жана вообщем канча % арзандатуу
//        болгону дагы чыксын
package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counterForNumberPro2 = 157;
        Allproducts product = new Allproducts();
        BAZADANNYH bazadannyh = new BAZADANNYH();
        Chek [] cheks = new Chek[0];
        Chek chek = new Chek();
        Allproducts[] massiveAllproduct = bazadannyh.getmyProduct();
        Allproducts[] massiveBasked = new Allproducts[0];
        Scanner scannerStr = new Scanner(System.in);
        MAINLOOP:
        while (true) {
            System.out.println("""
                    1.List all products
                    2.Set product to my basked
                    3.Delete product in my basked
                    4.Get all product in  my basked
                    5.Byu all products in my Basked
                    0.Exit
                    """);
            String actionMain = scannerStr.nextLine();
            if (actionMain.equalsIgnoreCase("1") || actionMain.equalsIgnoreCase("List")) {
                bazadannyh.printAllProducts();
            } else if (actionMain.equalsIgnoreCase("2")){
                bazadannyh.printAllProducts();
                Allproducts[] name = product.setProductinMagazin(massiveAllproduct, massiveBasked);
                if (name != null) {
                    massiveBasked = name;
                } else System.out.println("ID invalid!");
            } else if (actionMain.equalsIgnoreCase("3") && massiveBasked.length>0) {
                System.out.println(Arrays.toString(massiveBasked));
                Allproducts[] aa = product.deleteProductinBasket(massiveBasked);
                if (aa != null) {
                    massiveBasked = aa;
                    System.out.println("Delete succes!");
                } else System.out.println("ID invalid!");
            } else if (actionMain.equalsIgnoreCase("4") &&massiveBasked.length>0) {
                System.out.println(Arrays.toString(massiveBasked));
            } else if (actionMain.equalsIgnoreCase("5") && massiveBasked.length>0) {
                cheks = product.getChekPrice(massiveAllproduct,massiveBasked,cheks);
                chek.printChek(cheks);
                chek.print2(cheks,counterForNumberPro2);
                counterForNumberPro2++;
                cheks = new Chek[0];
                massiveBasked = new Allproducts[0];
            }else if (actionMain.equalsIgnoreCase("0")){
                break MAINLOOP;
            }else System.out.println("Error");
        }

    }
}
