package exercises;

import java.io.IOException;

/**
 * Target角色
 *
 * @author duanbt
 * @version 1.0
 **/
public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
