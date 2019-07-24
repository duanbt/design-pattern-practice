import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * @author duanbt
 * @version 1.0
 **/
public class BigChar {

    /**
     * 字符名字
     */
    private char charName;

    /**
     * 大型字符对应的字符串
     */
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        URL classpathUrl = BigChar.class.getClassLoader().getResource("");
        String classpath = classpathUrl.getFile();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(new File(classpath, "big" + charName + ".txt")))
        ) {
            StringBuilder buffer = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
            reader.close();
            String s = buffer.toString();
            int lastIndex = s.lastIndexOf("\n");
            this.fontData = s.substring(0, lastIndex);
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
