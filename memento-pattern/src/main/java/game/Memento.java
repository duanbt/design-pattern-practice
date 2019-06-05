package game;

import java.util.ArrayList;
import java.util.List;

/**
 * 保存状态的类
 *
 * @author duanbt
 * @version 1.0
 **/
public class Memento {
    //所持金钱
    int money;
    //获得的水果
    List<String> fruits;

    /**
     * wide interface
     *
     * @param money
     */
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    /**
     * narrow interface
     *
     * @return
     */
    public int getMoney() {
        return this.money;
    }

    /**
     * wide interface
     *
     * @param fruit
     */
    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    /**
     * wide interface
     *
     * @return
     */
    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }


}
