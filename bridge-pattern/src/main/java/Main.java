/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Hello1"));
        Display countDisplay1 = new CountDisplay(new StringDisplayImpl("hello21"));
        CountDisplay countDisplay2 = new CountDisplay(new StringDisplayImpl("hello22"));

        display.display();
        countDisplay1.display();
        countDisplay2.multiDisplay(3);
    }
}
