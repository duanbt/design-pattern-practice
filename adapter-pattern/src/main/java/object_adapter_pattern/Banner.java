package object_adapter_pattern;

/**
 * 被适配者
 *
 * @author duanbt
 * @version 1.0
 **/
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
