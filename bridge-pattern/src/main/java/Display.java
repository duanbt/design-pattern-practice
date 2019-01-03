/**
 * 类的功能层次结构
 * impl字段为类的两个层次结构的“桥梁”
 *
 * @author duanbt
 * @version 1.0
 **/
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
