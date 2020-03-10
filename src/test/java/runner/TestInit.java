package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestInit {

    public static Properties getProp() {
        return prop;
    }

    private static Properties prop;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = openBrowser();
        }
        return driver;
    }

    public static WebDriver openBrowser() {
        initProp();
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRADYUMNA\\IdeaProjects\\FriendSurance\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", ".\\firefoxdriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void initProp() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/test/java/com/config/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


