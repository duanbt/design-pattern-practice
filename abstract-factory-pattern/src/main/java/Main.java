import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.com/");
        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Link baidu = factory.createLink("baidu", "http://www.baidu.com/");
        Link google = factory.createLink("google", "http://www.google.com/");
        Tray traysearch = factory.createTray("搜索引擎");
        traysearch.add(baidu);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "链接页");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
