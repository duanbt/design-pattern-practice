/**
 * 装饰左右边框的类
 *
 * @author duanbt
 * @version 1.0
 **/
public class SideBorder extends Border {
    private char borderChar;
    protected SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
