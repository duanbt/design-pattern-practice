package factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 抽象HTML页面类，抽象的产品
 *
 * @author duanbt
 * @version 1.0
 **/
public abstract class Page implements HTMLAble{
    protected String title;
    protected String author;
    protected ArrayList<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(this.makeHTML());
            fileWriter.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
