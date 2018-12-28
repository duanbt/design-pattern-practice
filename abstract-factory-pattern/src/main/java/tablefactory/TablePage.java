package tablefactory;

import factory.Page;

/**
 * @author duanbt
 * @version 1.0
 **/
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer
                .append("<html>\n")
                .append("<head><title>")
                .append(this.title)
                .append("</title></head>\n")
                .append("<body>\n")
                .append("    <h1>")
                .append(this.title)
                .append("</h1>\n")
                .append("    <table width=\"80%\" border=\"3\">\n");
        this.content.forEach(item -> buffer.append("        <tr>").append(item.makeHTML()).append("</tr>\n"));
        buffer.append("    </table>\n" +
                "</body>\n" +
                "</html>");
        return buffer.toString();
    }
}
