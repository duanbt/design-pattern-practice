package factory;

import java.util.ArrayList;

/**
 * 抽象容器类，含有一个或多个Link类和Tray类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Tray extends Item{
    protected ArrayList<Item> tray = new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
