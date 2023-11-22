package task2;

public interface PhoneInterface {
    boolean turnOn ();
    String callName(String name);
    String callPhoneNumber(String phonen);
    Contact searchContact(Contact [] contacts);
    Contact updateName(String oldname,String newname);
    void getAllContacts();
}
