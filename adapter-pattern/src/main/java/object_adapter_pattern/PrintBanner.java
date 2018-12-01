package object_adapter_pattern;

/**
 * 适配器
 *
 * @author duanbt
 * @version 1.0
 **/
public class PrintBanner extends Print{

    private final Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
