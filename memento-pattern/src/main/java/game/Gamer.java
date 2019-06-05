package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 游戏主人公
 *
 * @author duanbt
 * @version 1.0
 **/
public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] fruitNames = {"苹果", "葡萄", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("所持金钱增加");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("所持金钱减半");
        } else if (dice == 6) {
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得了水果(" + fruit + ")");
        } else {
            System.out.println("什么都没有发生");
        }
    }

    /**
     * 创建快照
     *
     * @return
     */
    public Memento createMemento() {
        Memento memento = new Memento(money);
        fruits.forEach(fruit -> {
            if (fruit.startsWith("好吃的")) {
                memento.addFruits(fruit);
            }
        });
        return memento;
    }

    /**
     * 恢复为指定快照
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitNames[random.nextInt(fruitNames.length)];
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
