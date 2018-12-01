package class_adapter_pattern;

/**
 * 适配器，适配 被适配者 到 目标对象
 * @author duanbt
 * @version 1.0
 **/
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
