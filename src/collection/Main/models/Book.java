package collection.Main.models;

public class Book {
    private Long id;
    private String name;
    private String avtorName;
    private Ganre janr;

    public Book() {
    }

    public Book(Long id, String name, String avtorName, Ganre janr) {
        this.id = id;
        this.name = name;
        this.avtorName = avtorName;
        this.janr = janr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvtorName() {
        return avtorName;
    }

    public void setAvtorName(String avtorName) {
        this.avtorName = avtorName;
    }

    public Ganre getJanr() {
        return janr;
    }

    public void setJanr(Ganre janr) {
        this.janr = janr;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avtorName='" + avtorName + '\'' +
                ", janr='" + janr + '\'' +
                '}';
    }
}
