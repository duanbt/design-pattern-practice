package pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * 用于编写简单的HTML页面
 *
 * @author duanbt
 * @version 1.0
 **/
class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    void title(String title) throws IOException {
        String htmlTitle = "<html lang='zh'>\n" +
                "<head>\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />" +
                "    <title>" + title + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>" + title + "</h1>\n";
        writer.write(htmlTitle);
    }

    void paragraph(String msg) throws IOException{
        writer.write("<p>" + msg + "</p>\n");
    }

    void link(String href, String caption) throws IOException{
        paragraph("<a href='"+href+"'>"+caption+"</a>");
    }

    void mailto(String mailAddr, String username) throws IOException{
        link("mailto:"+mailAddr, username);
    }

    void close() throws IOException {
        String htmlFoot = "</body>" + "</html>\n";
        writer.write(htmlFoot);
        writer.close();
    }
}
