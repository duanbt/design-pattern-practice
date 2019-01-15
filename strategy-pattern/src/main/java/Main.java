/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Player playerA = new Player("A", new WinningStrategy());
        Player playerB = new Player("B", new ProbStrategy());
        for (int i = 0; i < 100000; i++) {
            Hand nextHandA = playerA.nextHand();
            Hand nextHandB = playerB.nextHand();
            if(nextHandA.isStrongerThan(nextHandB)){
                System.out.println("Winner:" + playerA);
                playerA.win();
                playerB.lose();
            }else if(nextHandB.isStrongerThan(nextHandA)){
                System.out.println("Winner:" + playerB);
                playerB.win();
                playerA.lose();
            }else {
                System.out.println("Even...");
                playerA.even();
                playerB.even();
            }
        }

        System.out.println(playerA);
        System.out.println(playerB);
    }
}
