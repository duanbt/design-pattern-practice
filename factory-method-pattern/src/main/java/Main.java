import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("小明");
        Product p2 = factory.create("小王");
        p1.use();
        p2.use();
    }
}
