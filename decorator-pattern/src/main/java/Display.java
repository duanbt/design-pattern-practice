/**
 * 显示字符串的抽象类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Display {
    /**
     * 获取横向字符数
     */
    public abstract int getColumns();

    /**
     * 获取纵向行数
     */
    public abstract int getRows();

    /**
     * 获取第row行的字符串
     * @param row 行数，从0开始
     */
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
