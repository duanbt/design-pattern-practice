package pagemaker;

import java.io.IOException;
import java.util.Properties;

/**
 * 从邮件地址文件中获取用户名的类
 *
 * @author duanbt
 * @version 1.0
 **/
class Database {
    private Database(){
    }

    static Properties getProperties(String dbName){
        String fileName = dbName + ".properties";
        Properties properties = new Properties();
        try {
            properties.load(Database.class.getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
