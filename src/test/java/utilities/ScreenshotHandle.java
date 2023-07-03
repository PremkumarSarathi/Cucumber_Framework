package utilities;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static stepDefinition.WebTestBase.driver;

public class ScreenshotHandle {
    public static void failedScreenshot(Scenario scenario){
        if (scenario.isFailed()) {
            // Take screenshot and embed it in the report
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedTestScreenshot");

            // Save the screenshot to a file
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            String filePath = System.getProperty("user.dir") + "\\screenshots\\" + screenshotName + ".png";
            System.out.println(filePath);
            try {
                Files.write(Paths.get(filePath), screenshot);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
