package file;

/**
 * @author duanbt
 * @version 1.0
 **/
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
