package collection.Main.AllServises.LibraryService;

import collection.Main.AllServises.GeneratorIds;
import collection.Main.models.DataBase;
import collection.Main.models.Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryImpl implements LibraryInterface {
    Library library = new Library();

    @Override
    public ArrayList<Library> saveLibrary(ArrayList<Library> libraries) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write name: ");
            String soz = scanner.nextLine();
            if (proverka(soz)) {
                library.setName(soz);
                break;
            }
        }
        while (true) {
            System.out.println("Write adress: ");
            String soz = scanner.nextLine();
            if (proverka(soz)) {
                library.setAddres(soz);
                break;
            }
        }
        library.setId(GeneratorIds.genLibrary());
        libraries.add(library);
        return libraries;
    }

    @Override
    public ArrayList<Library> getAllLibraries() {
        return DataBase.libraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (id.equals(DataBase.libraries.get(i).getId())) {
                return DataBase.libraries.get(i);
            }
        }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (id.equals(DataBase.libraries.get(i).getId())) {
                DataBase.libraries.set(i,library);
                return DataBase.libraries.get(i);
            }
        }

        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (int i = 0; i < DataBase.libraries.size(); i++) {
            if (id.equals(DataBase.libraries.get(i).getId())) {
                DataBase.libraries.remove(i);
                return "Success";
            }
        }return "Not id";
    }

    public static boolean proverka(String name) {
        if (name.length() > 1) {
            return true;
        }
        return false;
    }
}
