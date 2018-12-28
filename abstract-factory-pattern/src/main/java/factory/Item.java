package factory;

/**抽象零件父类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Item implements HTMLAble {
    protected String caption;

    public Item(String caption){
        this.caption = caption;
    }
}
