package object_adapter_pattern;

/**
 * 调用者
 *
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printStrong();
        print.printWeak();
    }
}
