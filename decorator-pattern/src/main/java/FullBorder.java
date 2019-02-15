/**
 * 装饰全边框的类
 *
 * @author duanbt
 * @version 1.0
 **/
public class FullBorder extends Border {
    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0){
            return "+" + makeLine('-', display.getColumns()) + "+"; //上边框
        }else if(row == display.getRows() + 1){
            return "+" + makeLine('-', display.getColumns()) + "+"; //下边框
        }else {
            return "|" + display.getRowText(row - 1) + "|"; //其他边框
        }
    }

    private String makeLine(char ch, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
