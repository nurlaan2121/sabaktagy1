package collection.Main.models;

public class Reader {
    private Long id;
    private String fullName;
    private String email;
    private String PhoneNumber;
    private Gender gender;

    public Reader() {
    }

    public Reader(long id, String fullName, String email, String phoneNumber, Gender gender) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        PhoneNumber = phoneNumber;
        this.gender = gender;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", gender=" + gender +
                '}';
    }
}
