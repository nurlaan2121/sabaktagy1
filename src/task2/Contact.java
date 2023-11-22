package task2;

public class Contact {
    private String fullName;
    private String TelephoneNumber;

    public Contact() {
    }

    public Contact(String fullName, String telephoneNumber) {
        this.fullName = fullName;
        TelephoneNumber = telephoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", TelephoneNumber='" + TelephoneNumber + '\'' + "\n";
    }
}
