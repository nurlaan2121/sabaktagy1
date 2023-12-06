package collection.Main.AllServises.ReaderService;

import collection.Main.models.Reader;

import java.util.ArrayList;
import java.util.List;

public interface ReaderInterface {
    void saveReader(Reader reader);

    ArrayList<Reader> getAllReaders();

    Reader getReaderById(Long id);

    Reader updateReader(Long id, Reader reader);

    void assignReaderToLibrary(Long readerId,Long libraryId);

}
