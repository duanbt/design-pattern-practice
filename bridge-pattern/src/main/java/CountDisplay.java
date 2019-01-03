/**
 * 类的功能层次结构，扩充了功能
 *
 * @author duanbt
 * @version 1.0
 **/
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
