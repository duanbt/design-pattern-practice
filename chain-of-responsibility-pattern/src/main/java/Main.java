/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        NoSupport noSupport = new NoSupport("noSupport");
        LimitSupport limitSupport = new LimitSupport("limitSupport", 100);
        SpecialSupport specialSupport = new SpecialSupport("specialSupport", 429);
        OddSupport oddSupport = new OddSupport("oddSupport");

        noSupport.next(limitSupport).next(specialSupport).next(oddSupport);
        for (int i = 0; i < 500; i++) {
            noSupport.support(new Trouble(i));
        }
    }
}
