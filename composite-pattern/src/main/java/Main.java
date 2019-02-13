import file.Directory;
import file.File;

/**
 * @author duanbt
 * @version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        File fa = new File("a.html", 1000);
        binDir.add(fa);
        binDir.add(new File("b.doc", 2000));

        rootDir.printList();

        System.out.println(fa.getFullName());
    }
}
