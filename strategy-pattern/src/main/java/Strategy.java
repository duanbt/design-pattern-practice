/**
 * 猜拳策略接口
 *
 * @author duanbt
 * @version 1.0
 **/
public interface Strategy {
    // 获取下一局要出的手势
    Hand nextHand();
    // 学习上一局手势是否获胜，上一局结束后，会调用此方法
    void study(boolean win);
}
