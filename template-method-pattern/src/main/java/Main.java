/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('哈');
        AbstractDisplay d2 = new StringDisplay("你好");

        d1.display();
        d2.display();
    }
}
