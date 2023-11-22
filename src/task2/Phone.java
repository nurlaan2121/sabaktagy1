package task2;

import java.util.Arrays;
import java.util.Scanner;

public class Phone implements PhoneInterface {
    private String name;
    private String brandName;
    private String paasword;
    Contact[] contacts;

    public Phone() {
    }

    public Phone(String name, String brandName, String paasword, Contact[] contacts) {
        this.name = name;
        this.brandName = brandName;
        this.paasword = paasword;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPaasword() {
        return paasword;
    }

    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                ", paasword='" + paasword + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public boolean turnOn() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equalsIgnoreCase("On")) {
            System.out.print("Write password:  ");
            String passwprd = scanner.nextLine();
            if (passwprd.equals(getPaasword())) {
                System.out.println("Welcome");
                return true;
            } else if (passwprd.equalsIgnoreCase("off")) {
                System.out.println("Phone off!");
            } else System.out.println("Password invalid!");
        } else System.out.println("Command invalid!");
        return turnOn();
    }

    @Override
    public String callName(String name) {
        for (Contact krug :contacts){
            if (krug.getFullName().equalsIgnoreCase(name)){
                return name + " Calling... ";
            }
        }
        return null;
     }

    @Override
    public String callPhoneNumber(String phonen) {
        for (Contact krug :contacts){
            if (krug.getTelephoneNumber().equalsIgnoreCase(phonen)){
                return phonen + " Calling... ";
            }
        }
        return null;
    }

    @Override
    public Contact searchContact(Contact[] contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write name for search: ");
        String name = scanner.nextLine();
        for (Contact contact : contacts) {
            if (name.equalsIgnoreCase(contact.getFullName())) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact updateName(String oldname, String newname) {
        for (Contact contact : contacts) {
            if (contact.getFullName().equalsIgnoreCase(oldname)) {
                contact.setFullName(newname);
                return contact;
            }
        }
        return null;
    }

    @Override
    public void getAllContacts() {
        System.out.println(Arrays.toString(contacts));
    }
}
