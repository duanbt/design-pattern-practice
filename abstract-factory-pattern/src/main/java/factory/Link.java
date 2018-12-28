package factory;

/**
 * 抽象HTML超链接类
 * @author duanbt
 * @version 1.0
 **/
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
