/**
 * @author duanbt
 * @version 1.0
 **/
public interface Printable {
    /**
     * 设置打印机名字
     */
    void setPrinterName(String name);

    /**
     * 获取打印机名字
     */
    String getPrinterName();

    /**
     * 打印输出
     */
    void print(String str);
}
