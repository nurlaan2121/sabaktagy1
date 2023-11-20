package superMyMarket;

public class GeneratorID {
    static long id = 0;

    public static long generator() {
        return ++id;

    }
}
