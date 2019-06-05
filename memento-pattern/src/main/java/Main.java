import game.Gamer;
import game.Memento;

import java.io.*;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static final String SAVE_FILENAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            System.out.println("读取上次保存存档开始游戏");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏");
            memento = gamer.createMemento();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("======" + i);
            System.out.println("当前状态" + gamer);

            gamer.bet();

            System.out.println("所持金钱为: " + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("[所持金钱增加了，因此游戏存档]");
                memento = gamer.createMemento();
                //保存至文件
                saveMemento(memento);
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

    private static void saveMemento(Memento memento) {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVE_FILENAME))){
            out.writeObject(memento);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Memento loadMemento() {
        Memento memento = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream(SAVE_FILENAME))) {
            memento = (Memento) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
