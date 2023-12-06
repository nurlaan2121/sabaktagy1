package collection.Main.AllServises.BookService;

import collection.Main.AllServises.GeneratorIds;
import collection.Main.models.Book;
import collection.Main.models.DataBase;
import collection.Main.models.Library;

import java.util.ArrayList;
import java.util.List;

public class BookImpl implements BookInterface {

    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (libraryId.equals(DataBase.libraries.get(i).getId())) {
                DataBase.libraries.get(i).setBooks(book);
                return book;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Book> getAllBooks(Long libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (libraryId.equals(DataBase.libraries.get(i).getId())) {
                return DataBase.libraries.get(i).getBooks();
            }
        }
        return null;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (libraryId.equals(DataBase.libraries.get(i).getId())) {
                for (int j = 0; j < DataBase.libraries.get(i).getBooks().size(); j++) {
                   if (DataBase.libraries.get(i).getBooks().get(j).getId().equals(bookId)) {
                        return DataBase.libraries.get(i).getBooks().get(j);
                    }
                }
            }
        }return null;
    }
    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (Library library : DataBase.libraries) {
            if (libraryId.equals(library.getId())) {
                List<Book> books = library.getBooks();
                for (int j = 0; j < books.size(); j++) {
                    if (bookId.equals(books.get(j).getId())) {
                        books.remove(j);
                        return "Success";
                    }
                }
            }
        }
        return "Book or Library not found";
    }


    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (libraryId.equals(DataBase.libraries.get(i).getId())){
                DataBase.libraries.get(i).getBooks().clear();
                System.out.println("Succes");
            }
        }

    }
}
