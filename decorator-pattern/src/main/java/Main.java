/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello World");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);

        d1.show();
        System.out.println();
        d2.show();
        System.out.println();
        d3.show();
    }
}
