package collection.Main.AllServises.ReaderService;

import collection.Main.models.DataBase;
import collection.Main.models.Reader;

import java.util.ArrayList;

public class ReaderImpl implements ReaderInterface {
    @Override
    public void saveReader(Reader reader) {
        DataBase.readers.add(reader);
    }

    @Override
    public ArrayList<Reader> getAllReaders() {
        return DataBase.readers;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (int i = 0; i < DataBase.readers.size(); i++) {
            if (id.equals(DataBase.readers.get(i).getId())) {
                return DataBase.readers.get(i);
            }
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        DataBase.readers.set(Math.toIntExact(id),reader);
        return reader;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (libraryId.equals(DataBase.libraries.get(i).getId())){
                for (int j = 0; j < DataBase.readers.size(); j++) {
                    if (readerId.equals(DataBase.readers.get(j).getId())){
                        DataBase.libraries.get(i).setReaders(DataBase.readers.get(j));
                    }
                }
            }
        }
    }
}
