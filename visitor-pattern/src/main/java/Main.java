import file.Directory;
import file.File;
import file.ListVisitor;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        rootDir.add(binDir);
        rootDir.add(new File("readme.txt", 10));
        binDir.add(new File("start.sh", 20));
        rootDir.accept(new ListVisitor());
    }
}
