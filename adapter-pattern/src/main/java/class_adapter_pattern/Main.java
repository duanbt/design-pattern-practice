package class_adapter_pattern;

/**
 * 请求者，使用者，调用目标对象方法
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();
    }
}
