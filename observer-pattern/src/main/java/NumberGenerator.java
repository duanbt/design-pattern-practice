import java.util.ArrayList;
import java.util.List;

/**
 * 生成数值对象的抽象类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    /**
     * 获取数值
     */
    public abstract int getNumber();

    /**
     * 生成数值
     */
    public abstract void execute();
}
