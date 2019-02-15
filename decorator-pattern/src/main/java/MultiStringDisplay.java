import java.util.ArrayList;
import java.util.List;

/**
 * 显示多行字符串的类
 * @author duanbt
 * @version 1.0
 **/
public class MultiStringDisplay extends Display{
    private List<String> body = new ArrayList<>();
    private int columns = 0;
    public void add(String msg){
        body.add(msg);
        updateColumns(msg);
    }

    private void updateColumns(String msg) {
        if(msg.getBytes().length > columns){
            columns = msg.getBytes().length;
        }
        //填充空格
        body.forEach(s -> {
            int fills = columns - s.getBytes().length;
            if(fills > 0){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < fills; i++) {
                    sb.append(' ');
                }
                s = s + sb.toString();
            }
        });
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }
}
