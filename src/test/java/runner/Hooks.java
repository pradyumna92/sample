package runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Hooks {

    String filePath = "C:\\Users\\PRADYUMNA\\IdeaProjects\\FriendSurance\\ScreenShots\\";
    WebDriver driver;

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario: " + scenario.getName());
        driver = TestInit.openBrowser();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenShot(scenario.getName(), driver);
        }
        driver.quit();
    }

    public void takeScreenShot(String methodName, WebDriver driver) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
