/**
 * @author duanbt
 * @version 1.0
 **/
public interface Context {
    void setClock(int hour);

    void changeState(State state);

    void recordLong(String msg);

    void callSecurityCenter(String msg);
}
