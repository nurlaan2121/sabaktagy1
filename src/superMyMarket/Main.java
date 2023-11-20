//Cиз супермаркетке келип сатып алып жатканыңызды элестетип
//        көрсөңүз, карта менен төлөйсүз, Эгер азык-түлүктүн суммасы 100
//        сомдон ашса, сизден пароль талап кылынат, киргизүүдө пароль
//        текшерилет жана эгер ал туура эмес болсо, консолго "туура эмес
//        пароль" чыгарылат, эгер ал туура болсо, сиз операцияны уланта
//        аласыз. эгерде сизде жетиштүү каражат болсо, Сиз төлөйсүз жана
//        консолдон сиз чекти көрө аласыз (азык-түлүктүн аталыштары жана
//        баалары жана алардын жалпы суммасы менен), ал эми
//        консолдо жок болсо "сизде каражат жетишпейт".
//        Card  деген класс тузунуз  (firstname, lastname, card number,
//        balance, password).
//        Product деген класс тузунуз   (productname, price).
//        Basket деген класс тузунуз  (products[] ).
//        Client  деген класс тузунуз  полялары (firstname, lastname, age,
//        card, basket).
//        cardInterface интерфейс  түзүңүз жана paywithcard(double money)
//        абстракттуу метод түзүңүз, ал метод сатылып алынган продуктынын
//        квитанциясын кайтарат, жана getcardbalance() методу картадагы
//        балансты кайтарат.
//        Client классы cardInterface мурасталып, анын методорун
//        реализация кылат.
//        *******************************************************************************
//        Представьте что вы пришли в супермаркет и совершаете
//        покупку, расплачиваетесь картой, если сумма на продукты
//        превышает 100 сом у вас запрашивается пароль, при вводе,
//        пароль проверяется и если он не верный, на консоль
//        выводится "не верный пароль", а если же он верный вы
//        можете продолжать операцию. если у вас достаточно
//        средств вы оплачиваете и на консоли вы можете увидеть чек
//        (с названиями и ценами на продукты и ощую сумму на них), а
//        если нет на консоль выводится "у вас не хватает средств".
//
//        Создайте класс Card (firstname, lastname, cardnumber, balance,
//        password).
//        Создайте класс product (productname, price).
//        Создайте класс basket (products[] ).
//        Создайте класс Client с полями(firstname, lastname, age, card,
//        basket).
//        Создайте interface cardInterface и метод abstract
//paywithcard(double money) возвращает чек на купленные
//        продукты и getcardbalance() возвращает баланс на карте.
//        класс Client наследуется от cardInterface и переопределяет его
package superMyMarket;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[0];
        double summa = 0;
        long ee  = 0;
        String [] historiBuy = new String[0];
        Card card = new Card("Nurlan", "Abiibillaev", "784559157485", 5000, 1545);
        Client client = new Client("Nurlan", "Abiibillaev", (byte) 43, card, products);
        Scanner scannerStr = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.Список всех продуктов!
                    2.Моя корзинка
                    3.Купит все товары из моего корзинка
                    4.Мой баланс на карта
                    0.Выход
                    """);
            String action = scannerStr.nextLine();
            if (action.equals("1")) {
                System.out.println(Arrays.toString(Product.getProducts()));
            } else if (action.equals("2")) {
                System.out.println(Arrays.toString(Product.getProducts()));
                System.out.println("Введите айди продукта!: ");
                String id = scannerStr.nextLine();
                if (id.contains("1") || id.contains("2") || id.contains("3")||id.contains("4")||id.contains("5")||id.contains("6")||id.contains("7")||id.contains("8")||id.contains("9")||id.contains("0")){
                    ee = Long.parseLong((id));
                }else System.out.println("Введите айди продукта!: ");
                products = new Basked().getKarzina(ee, products);
                summa = 0;
            } else if (action.equals("3") && products.length > 0) {
                summa = 0;
                for (Product product : products) {
                    summa += product.getPriceZAKG();
                }
                if (!(client.paywithcard(summa, products, client)).equals("null")){
                    products = client.deleteEndProduct(products);
                    historiBuy = Client.history(summa,historiBuy);
                }else summa = 0;
            } else if (action.equals("4")) {
                System.out.println("На вашем балансе есть: ");
                card.setBalance(client.getcardbalance(summa, client));
                System.out.println("Все оплаты: ");
                System.out.println(Arrays.toString(historiBuy));
                summa = 0;

            } else if (action.equals("0")) {
                System.out.println("Программа зовершена!");
                break;
            } else System.out.println("Нет такой команды!");

        }
    }
}
