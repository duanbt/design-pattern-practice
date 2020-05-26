import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author duanbt
 **/
public class Main {

    public static void main(String[] args) throws URISyntaxException {
        URI uri = Thread.currentThread().getContextClassLoader().getResource("program.txt").toURI();
        try (
                BufferedReader reader = new BufferedReader(new FileReader(new File(uri)))
        ) {
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text: \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
