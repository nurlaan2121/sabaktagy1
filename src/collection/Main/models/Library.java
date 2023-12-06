package collection.Main.models;

import java.util.ArrayList;

public class Library {
    private Long id;
    private String name;
    private String addres;
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Reader> readers = new ArrayList<>();

    public Library() {
    }

    public Library(long id, String name, String addres, ArrayList<Book> books, ArrayList<Reader> readers) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.books = books;
        this.readers = readers;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(Book kelgen) {
        books.add(kelgen);
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Reader kelgen) {
        readers.add(kelgen);
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", books=" + books +
                ", readers=" + readers +
                '}';
    }
}
