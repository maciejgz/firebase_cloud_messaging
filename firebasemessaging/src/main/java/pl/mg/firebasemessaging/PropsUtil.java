package pl.mg.firebasemessaging;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropsUtil {

    public static String getProperty(String key) {
        Properties prop = new Properties();
        InputStream in = PropsUtil.class.getClassLoader().getResourceAsStream(
                "app.properties");
        try {
            prop.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty(key);
    }

    public static Properties getProps() {
        Properties prop = new Properties();
        InputStream in = PropsUtil.class.getClassLoader().getResourceAsStream(
                "app.properties");
        try {
            prop.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
