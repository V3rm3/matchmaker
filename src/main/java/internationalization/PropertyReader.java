package internationalization;

import java.io.IOException;
import java.util.Properties;

/**
 * @author renantdesouza.
 * @since 04/06/2016.
 * */
public class PropertyReader {

    private static Properties prop;
    private static String lastFile;

    public static Object getProperty(String file, String name) {
        try {
            if (lastFile == null || !lastFile.equals(file)) {
                getProp().load(getClassLoader().getResourceAsStream(file));
                lastFile = file;
            }
            return getProp().get(name);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Properties getProp() {
        return prop == null ? prop = new Properties() : prop;
    }

    private static ClassLoader getClassLoader() {
        return new PropertyReader().getClass().getClassLoader();
    }

}
