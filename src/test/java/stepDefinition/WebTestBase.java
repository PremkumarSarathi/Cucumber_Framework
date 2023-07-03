package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ScreenshotHandle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WebTestBase {
    public static WebDriver driver;

    public static final Logger LOGGER = Logger.getLogger(WebTestBase.class);

    @Before
    public void setup() {
        // Set the path to the chromedriver executable
        WebDriverManager.chromedriver().setup();

        // Create an instance of WebDriver (e.g., ChromeDriver)
        driver = new ChromeDriver();
        LOGGER.info("Initiate the chrome driver");
        driver.manage().window().maximize();
        LOGGER.info("Maximize the driver window");
    }

    @After (order = 1)
    public void screenshot(Scenario scenario) {
        ScreenshotHandle.failedScreenshot(scenario);
    }

    @After (order = 0)
    public void teardown() {
        // Quit the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
