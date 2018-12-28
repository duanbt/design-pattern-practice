package listfactory;

import factory.Page;

/**
 * 具体的页面
 *
 * @author duanbt
 * @version 1.0
 **/
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer
                .append("<html>\n").append("<head><title>").append(title).append("</title></head>\n")
                .append("<body>\n").append("<h1>").append(title).append("</h1>\n").append("<ul>");
        this.content.forEach(item -> buffer.append(item.makeHtml()));
        buffer
                .append("</ul>\n")
                .append("<hr><address>")
                .append(this.author)
                .append("</address>\n")
                .append("</body>\n")
                .append("</html>");
        return buffer.toString();
    }
}
