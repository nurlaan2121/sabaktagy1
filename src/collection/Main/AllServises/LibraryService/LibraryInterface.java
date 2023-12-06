package collection.Main.AllServises.LibraryService;

import collection.Main.models.Library;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface LibraryInterface {

    ArrayList<Library>saveLibrary(ArrayList<Library> libraries);

    ArrayList<Library>getAllLibraries();

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library library);

    String deleteLibrary(Long id);
}
