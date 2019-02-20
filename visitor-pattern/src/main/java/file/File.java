package file;

/**
 * @author duanbt
 * @version 1.0
 **/
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
