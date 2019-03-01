/**
 * 发生问题的类
 *
 * @author duanbt
 * @version 1.0
 **/
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble" + number;
    }
}
