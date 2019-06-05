import game.Gamer;
import game.Memento;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("======" + i);
            System.out.println("当前状态" + gamer);

            gamer.bet();

            System.out.println("所持金钱为: " + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("[所持金钱增加了，因此游戏存档]");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("[所持金钱大幅减少，因此游戏将恢复之前的存档]");
                gamer.restoreMemento(memento);
            }

            System.out.println();
            //缓一会儿
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}
