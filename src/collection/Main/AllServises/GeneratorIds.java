package collection.Main.AllServises;

public class GeneratorIds {
    public static Long i4 = 0L;
    public static Long id2 = 0L;
    public static Long id3 = 0L;
    public static long genBook(){
        return ++i4;
    }public static long genReader(){
        return ++id2;
    }public static long genLibrary(){
        return ++id3;
    }
}
