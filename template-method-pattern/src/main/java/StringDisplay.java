/**
 * 具体类
 *
 * @author duanbt
 * @version 1.0
 **/
public class StringDisplay extends AbstractDisplay {

    private String string;

    private int width;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    @Override
    void open() {
        printLine();
    }

    @Override
    void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
