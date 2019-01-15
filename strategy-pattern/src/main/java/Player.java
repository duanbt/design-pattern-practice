/**
 * 选手
 *
 * @author duanbt
 * @version 1.0
 **/
public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int lostCount;
    private int gameCount;
    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose(){
        strategy.study(false);
        lostCount++;
        gameCount++;
    }
    public void even(){
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", lostCount=" + lostCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
