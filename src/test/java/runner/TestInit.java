package runner;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestInit {

    public static Properties prop;
    public static WebDriver driver;

    public TestInit() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/java/com/config/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


