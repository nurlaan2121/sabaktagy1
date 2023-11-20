package superMyMarket;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Client implements CardInterFace {
    private String firstName;
    private String lastName;
    private byte age;
    private Card card;
    private Product[] basked;

    public Client(String nurlan, String abiibillaev, byte age, Card card, Product[] products) {
        this.firstName = nurlan;
        this.lastName = abiibillaev;
        this.age = age;
        this.card = card;
        this.basked = products;
    }

    @Override
    public String paywithcard(double money, Product[] products, Client client) {
        Scanner scanner = new Scanner(System.in);
        if (money > 100) {
            if (money < client.getCard().getBalance()) {
                System.out.println("У вас на корзинке :");
                for (Product product : products) {
                    System.out.println("Продукт{" +
                            "Имя продукта: '" + product.getProductName() + '\'' +
                            ", Цена на кг: " + product.getPrice() +
                            ", Цена =" + product.getPriceZAKG() + "\n");
                }
                System.out.println("Общая сумма:  " + money);
                System.out.println("Введите пароль для покупки: ");
                int parol = scanner.nextInt();
                if (parol == getCard().getPassword()) {
                    System.out.println("Успешно!");
                    System.out.println("                            Чек:       ");
                    System.out.println("Дата :" + ZonedDateTime.now());
                    for (Product product : products) {
                        System.out.println("Продукт{" +
                                "Имя продукта: '" + product.getProductName() + '\'' +
                                ", Цена на кг: " + product.getPrice() +
                                ", Цена =" + product.getPriceZAKG() + "\n");
                        System.out.println("Общая сумма:  " + money);
                    }
                } else {
                    System.out.println("Пароль не верно поторите попытку: ");
                    return "null";
                }
            } else System.out.println("У вас на карте нет такой сумму!");
        } else {
            System.out.println("Успешно");
        }
        return "Повторите попытку позже!";
    }

    @Override
    public double getcardbalance(double money, Client client) {
        if (client.getCard().getBalance() >= money) {
            System.out.println(card.getBalance() - money);
            return card.getBalance() - money;
        }
        System.out.println(card.getBalance());
        return card.getBalance();
    }

    @Override
    public Product[] deleteEndProduct(Product[] products) {
        products = new Product[0];
        return products;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Product[] getBasked() {
        return basked;
    }

    public void setBasked(Product[] basked) {
        this.basked = basked;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", card=" + card +
                ", basked=" + Arrays.toString(basked) +
                '}';
    }

    public static String[] history(double money, String[] allHistory) {
        String[] newAllHistory = Arrays.copyOf(allHistory, allHistory.length + 1);
        newAllHistory[allHistory.length] = GeneratorID.generator() + ") | Общая сумма:  " + money + " | Date:  " + ZonedDateTime.now() + "\n";
        return newAllHistory;
    }


}
