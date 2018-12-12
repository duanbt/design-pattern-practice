/**
 * Prototype（原型）
 *
 * @author duanbt
 * @version 1.0
 **/
public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
