package tablefactory;

import factory.Tray;

/**
 * @author duanbt
 * @version 1.0
 **/
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer
                .append("<td>\n")
                .append("    <table width=\"100%\" border=\"1\">\n")
                .append("        <tr>\n")
                .append("            <td bgcolor=\"#a9a9a9\" align=\"center\" colspan=\"")
                .append(this.tray.size())
                .append("\"><b>")
                .append(this.caption)
                .append("</b></td>\n")
                .append("        </tr>\n")
                .append("        <tr>\n");
        this.tray.forEach(item -> buffer.append(item.makeHtml()));
        buffer
                .append("        </tr>\n")
                .append("    </table>\n")
                .append("</td>");
        return buffer.toString();
    }
}
