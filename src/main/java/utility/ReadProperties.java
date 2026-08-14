package utility;

public class ReadProperties {

    public static String getProperty(String key) {
        String value = null;
        try {
            java.util.Properties properties = new java.util.Properties();
            properties.load(new java.io.FileInputStream("src/main/resources/config.properties"));
            value = properties.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
