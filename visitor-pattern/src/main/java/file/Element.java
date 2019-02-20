package file;

/**
 * @author duanbt
 * @version 1.0
 **/
public interface Element {
    void accept(Visitor v);
}
