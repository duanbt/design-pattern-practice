/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen uPen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        manager.register("strong message", uPen);
        manager.register("warning box", mBox);

        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");

        p1.use("hello");
        p2.use("warning");
    }
}
