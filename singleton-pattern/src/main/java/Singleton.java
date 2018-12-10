/**
 * @author duanbt
 * @version 1.0
 **/
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
