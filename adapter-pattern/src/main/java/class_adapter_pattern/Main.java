package class_adapter_pattern;

/**
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
