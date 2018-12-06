package exercises;

import java.io.IOException;

/**
 * Client角色
 *
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("J:\\IdeaProjects\\design-pattern-practice\\adapter-pattern\\src\\main\\java\\exercises\\file.txt");
            f.setValue("year", "2018");
            f.setValue("month", "10");
            f.writeToFile("J:\\IdeaProjects\\design-pattern-practice\\adapter-pattern\\src\\main\\java\\exercises\\newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
