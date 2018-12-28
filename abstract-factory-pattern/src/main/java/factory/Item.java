package factory;

/**抽象零件父类
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Item {
    protected String caption;

    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeHtml();
}
