package listfactory;

import factory.Link;

/**
 * 具体的超链接类
 *
 * @author duanbt
 * @version 1.0
 **/
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href='" + this.url + "'>" + this.caption + "</a></li>\n";
    }
}
