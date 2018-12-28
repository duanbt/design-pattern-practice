package listfactory;

import factory.Tray;

/**
 * 具体的容器类
 *
 * @author duanbt
 * @version 1.0
 **/
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer
                .append("<li>\n")
                .append(this.caption).append("\n")
                .append("    <ul>\n");
        this.tray.forEach(item -> buffer.append(item.makeHTML()));
        buffer
                .append("    </ul>\n")
                .append("</li>\n");
        return buffer.toString();
    }
}
