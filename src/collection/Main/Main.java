package collection.Main;
//Срок сдачи : 06.12.2023 / 18:00
//        Models
//        Library(id, name, address, List<Book>books, List<Reader>readers)
//        Book(id, name, author, Genre genre)
//        Reader(id, fullName, email, phoneNumber, Gender gender)
//        Database(List<Library>libraries, List<Book>books,List<Reader>readers)
//        2. Methods
//
//        LibraryService
//        List<Library>saveLibrary(List<Library>libraries);
//
//        List<Library>getAllLibraries();
//
//        Library getLibraryById(Long id);
//
//        Library updateLibrary(Long id, Library library);
//
//        String deleteLibrary(Long id);
//
//
//
//        BookService
//        Book saveBook(Long libraryId,Book book);
//
//        List<Book>getAllBooks(Long libraryId);
//
//        Book getBookById(Long libraryId, Long bookId);
//
//        String deleteBook(Long libraryId,Long bookId);
//
//        void clearBooksByLibraryId(Long libraryId);
//
//
//
//        ReaderService
//        void saveReader(Reader reader);
//
//        List<Reader> getAllReaders();
//
//        Reader getReaderById(Long id);
//
//        Reader updateReader(Long id, Reader reader);
//
//        void assignReaderToLibrary(Long readerId,Long libraryId);
//
//
//
//        Бардык методдор Main класска чакырылып, switch case аркылуу ирээттуу турдо консольго чыксын

import collection.Main.AllServises.BookService.BookImpl;
import collection.Main.AllServises.GeneratorIds;
import collection.Main.AllServises.LibraryService.LibraryImpl;
import collection.Main.AllServises.ReaderService.ReaderImpl;
import collection.Main.models.*;

import javax.crypto.spec.PSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryImpl library = new LibraryImpl();
        ReaderImpl reader = new ReaderImpl();
        BookImpl book = new BookImpl();
        LOOP1:
        while (true) {
            System.out.println("""
                    Choice comand: 
                    1.Add new Library
                    2.Get all librares
                    3.Get library by ID
                    4.Update library 
                    5.Delete Labrary
                    6.Add new book
                    7.Get all books
                    8.Get book by ID
                    9.Delete Book
                    10.Clear all book in Lybrari by ID
                    11.Add new Reader
                    12.Get all readers
                    13.Get reader by ID
                    14.Update Reader
                    15.AssignReaderToLibrary                   
                    """);
            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 1 -> {
                        library.saveLibrary(DataBase.libraries);
                    }
                    case 2 -> {
                        System.out.println(library.getAllLibraries());
                    }
                    case 3 -> {
                        System.out.println("Write ID library");
                        Library library1 = library.getLibraryById(scanner.nextLong());
                        if (library1 != null) {
                            System.out.println(library1);
                        } else System.out.println("Not find!");
                    }
                    case 4 -> {
                        System.out.println("Write id ");
                        long ddd = scanner.nextLong();
                        for (int i = 0; i < DataBase.libraries.size(); i++) {
                            if (ddd == DataBase.libraries.get(i).getId()) {
                                Library library1 = DataBase.libraries.get(i);
                                System.out.println("""
                                        Choice command
                                        1.Name
                                        2.Adress
                                                                        
                                        """);
                                try {
                                    switch (new Scanner(System.in).nextInt()) {
                                        case 1 -> {
                                            System.out.println("Write name: ");
                                            library1.setName(new Scanner(System.in).nextLine());
                                            library.updateLibrary(ddd, library1);

                                        }
                                        case 2 -> {
                                            System.out.println("Write adress: ");
                                            library1.setAddres(new Scanner(System.in).nextLine());
                                            library.updateLibrary(ddd, library1);
                                        }
                                    }
                                } catch (InputMismatchException exception) {
                                    System.out.println("San jaz");
                                }
                            }
                        }
                    }
                    case 5 -> {
                        System.out.println("Write ID library: ");
                        System.out.println(library.deleteLibrary(new Scanner(System.in).nextLong()));
                    }
                    case 6 -> {
                        System.out.println("Write ID library");
                        long id = new Scanner(System.in).nextLong();
                        for (int i = 0; i < DataBase.libraries.size(); i++) {
                            if (id == DataBase.libraries.get(i).getId()) {
                                Book book1 = new Book();
                                System.out.println("Write name book");
                                book1.setName(new Scanner(System.in).nextLine());
                                System.out.println("Write avtor full name: ");
                                book1.setAvtorName(new Scanner(System.in).nextLine());
                                while (true) {
                                    System.out.println("Write janr(FANTAZY || ADVENTURE || ROMANCE)");
                                    String janr = scanner.nextLine();
                                    if (janr.equalsIgnoreCase("FANTAZY")) {
                                        book1.setJanr(Ganre.FANTAZY);
                                        break;
                                    } else if (janr.equalsIgnoreCase("ADVENTURE")) {
                                        book1.setJanr(Ganre.ADVENTURE);
                                        break;
                                    } else if (janr.equalsIgnoreCase("ROMANCE")) {
                                        book1.setJanr(Ganre.ROMANCE);
                                        break;
                                    }
                                }
                                book1.setId(GeneratorIds.genBook());
                                book.saveBook(id, book1);

                            }
                        }

                    }
                    case 7 -> {
                        System.out.println("Write ID Library: ");
                        System.out.println(book.getAllBooks(new Scanner(System.in).nextLong()));
                    }
                    case 8 -> {
                        System.out.println("Write ID Library: ");
                        long id = new Scanner(System.in).nextLong();
                        System.out.println("Write ID book");
                        System.out.println(book.getBookById(id, new Scanner(System.in).nextLong()));
                    }
                    case 9 -> {
                        System.out.println("Write ID Library: ");
                        long id = new Scanner(System.in).nextLong();
                        System.out.println("Write ID book");
                        System.out.println(book.deleteBook(id, new Scanner(System.in).nextLong()));
                    }
                    case 10 -> {
                        System.out.println("Write ID Library: ");
                        long id = new Scanner(System.in).nextLong();
                        book.clearBooksByLibraryId(id);
                    }
                    case 11 -> {
                        Reader reader1 = new Reader();
                        System.out.println("Write full name");
                        reader1.setFullName(new Scanner(System.in).nextLine());
                        System.out.println("Write phone number: ");
                        reader1.setPhoneNumber(new Scanner(System.in).nextLine());
                        while (true) {
                            System.out.println("Write email: ");
                            String email = scanner.nextLine();
                            if (email.endsWith("@gmail.com")) {
                                reader1.setEmail(email);
                                break;
                            }
                        }
                        while (true) {
                            System.out.println("Write gender: (M||F)");
                            String email = scanner.nextLine();
                            if (email.equalsIgnoreCase("m")) {
                                reader1.setGender(Gender.MALE);
                                break;
                            } else if (email.equalsIgnoreCase("f")) {
                                reader1.setGender(Gender.FEAMLE);
                                break;
                            }
                        }
                        reader1.setId(GeneratorIds.genReader());
                        reader.saveReader(reader1);
                    }
                    case 12 -> {
                        System.out.println(reader.getAllReaders());
                    }
                    case 13 -> {
                        System.out.println("Write id reader: ");
                        System.out.println(reader.getReaderById(new Scanner(System.in).nextLong()));
                    }
                    case 14 -> {
                        System.out.println("Write id ");
                        long ddd = scanner.nextLong();
                        for (int i = 0; i < DataBase.readers.size(); i++) {
                            if (ddd == DataBase.readers.get(i).getId()) {
                                Reader reader1 = DataBase.readers.get(i);
                                System.out.println("""
                                        Choice command
                                        1.Full Name
                                        2.Phone number
                                        3.Email
                                        4.Gender
                                                                        
                                        """);
                                try {
                                    switch (new Scanner(System.in).nextInt()) {
                                        case 1 -> {
                                            System.out.println("Write full name: ");
                                            reader1.setFullName(new Scanner(System.in).nextLine());
                                        }
                                        case 2 -> {
                                            System.out.println("Write Phone number: ");
                                            reader1.setPhoneNumber(new Scanner(System.in).nextLine());

                                        }
                                        case 3 ->{
                                            System.out.println("Write email:");

                                        }case 4->{
                                            while (true) {
                                                System.out.println("Write gender: (M||F)");
                                                String email = scanner.nextLine();
                                                if (email.equalsIgnoreCase("m")) {
                                                    reader1.setGender(Gender.MALE);
                                                    break;
                                                } else if (email.equalsIgnoreCase("f")) {
                                                    reader1.setGender(Gender.FEAMLE);
                                                    break;
                                                }
                                            }
                                        }case 0->{break;}
                                    }
                                } catch (InputMismatchException exception) {
                                    System.out.println("San jaz");
                                }
                            }
                        }
                    }case 15->{
                        System.out.println("Write ID readera");
                        long id = new Scanner(System.in).nextLong();
                        System.out.println("Write ID Library");
                        reader.assignReaderToLibrary(id,new Scanner(System.in).nextLong());
                    }case 0->{break LOOP1;}
                }
            } catch (InputMismatchException exception) {
                System.out.println("San jaz");
                scanner.next();
            }
        }


    }
}
