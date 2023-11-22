//2 класс тузунуз * Contact(phoneNumber, fullName) * Phone(brand, name, password,
//        Contacts[] contacts)
//        * PhoneInterface деген interface тузунуз, turnOn(); телефонду жандырат, пароль
//        сурайт анан ошол пароль туура болсо "Телефон жанды" деп кайтарат метод.
//        * call(); деген 2 метод бар бироосу параметрине телефон номер сурайт анан
//        издейт эгер тапса номер менен ошол номерди жана ошол номер кандай
//        атта сакталган болсо ошол аты менен чалып жатасыз деп кайтарып берет
//        * call(); дагы бир методу атын жазасыз эгер ошол ат менен сакталган контакт
//        табылса ошол контакттын атын жана ошол номерди кайтарып ушуга чалып
//        жатасыз деп кайтарып берет
//        * searchContact(); деген методдун жардамы менен контакттарды издейсиз
//        параметрине бир контактын аты жазылат, ошол ат менен контакт табылса
//        ошол контакты(Contact) кайтарып берет
//        * Contact updateName(); бул методдун жардамы менен контакттын атын
//        озгортсо болот, параметрине 2 соз алат ( эскиАты, жаныАты)
//        * getAllContacts(); бул метод бир телефондун ичиндеги контактардын баарын
//        алып берет
//        * main - ден класстардын объекттерин тузуп программанызды иштетиниз
package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact[] allMyContacts = {
                new Contact("Nurlan", "0773453534"),
                new Contact("Kasym", "0753453453"),
                new Contact("Timur", "0777345353"),
                new Contact("Erzat", "0777853343"),
                new Contact("Erjan", "0777563633"),
                new Contact("Erlan", "0777534657")
        };
        Phone phone = new Phone("Iphone", "5s", "1545", allMyContacts);
        if (phone.turnOn()) {
            while (true) {
                System.out.println("""
                        1.Get all contakts
                        2.Call in name
                        3.Call in Phone number
                        4.Update contacts
                        5.Search contact
                        0.Exit
                        """);
                switch (scanner.nextLine()) {
                    case "1" -> phone.getAllContacts();
                    case "2" -> {
                        System.out.print("Write name contact: ");
                        System.out.println(phone.callName(scanner.nextLine()));
                    }
                    case "3" -> {
                        System.out.print("Write Phone number: ");
                        System.out.println(phone.callPhoneNumber(scanner.nextLine()));
                    }
                    case "4" -> {
                        System.out.print("Write old name: ");
                        String name = scanner.nextLine();
                        System.out.print("Write new name: ");
                        System.out.println(phone.updateName(name, scanner.nextLine()));
                    }
                    case "5" -> {
                        System.out.println(phone.searchContact(allMyContacts));
                    }
                    case "0" -> {return;}
                    default -> System.out.println("Not command");}

            }
        }
    }
}
