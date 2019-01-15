import java.util.Random;

/**
 * 赢了就出一样的策略
 *
 * @author duanbt
 * @version 1.0
 **/
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    public WinningStrategy(){
        random = new Random();
    }
    @Override
    public Hand nextHand() {
        if(!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
