/**
 * 实现模板方法，声明模板方法中调用的抽象方法
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class AbstractDisplay {

    abstract void open();
    abstract void print();
    abstract void close();

    final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
