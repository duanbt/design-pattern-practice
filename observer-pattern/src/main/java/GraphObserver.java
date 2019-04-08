/**
 * @author duanbt
 * @version 1.0
 **/
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int number = generator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(200);
        } catch (InterruptedException ignored) {
        }
    }
}
