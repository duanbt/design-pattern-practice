package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Properties;

/**
 * 生成指定用户的web页面
 *
 * @author duanbt
 * @version 1.0
 **/
public class PageMaker {
    private PageMaker() {

    }
    public static void makeWelcomePage(String mailAddr, String filename) {
        Properties mailProp = Database.getProperties("mail");
        String username = mailProp.getProperty(mailAddr);
        try {
            URL classPath = PageMaker.class.getClassLoader().getResource("");
            HtmlWriter writer = new HtmlWriter(new FileWriter(Objects.requireNonNull(classPath).getPath() + filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + " 的主页");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
