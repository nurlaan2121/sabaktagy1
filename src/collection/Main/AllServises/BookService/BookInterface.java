package collection.Main.AllServises.BookService;

import collection.Main.models.Book;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface BookInterface {
    Book saveBook(Long libraryId, Book book);

    ArrayList<Book> getAllBooks(Long libraryId);

    Book getBookById(Long libraryId, Long bookId);

    String deleteBook(Long libraryId,Long bookId);

    void clearBooksByLibraryId(Long libraryId);
}
