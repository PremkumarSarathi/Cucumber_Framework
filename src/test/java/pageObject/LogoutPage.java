package pageObject;

import PageObjectKey.LogoutPageKey;
import action.Actions;
import constant.FilePathConstant;
import org.openqa.selenium.By;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

public class LogoutPage extends WebTestBase {
    public PropertyParser propertyParser;
    public LogoutPage(){
        propertyParser = new PropertyParser(FilePathConstant.LOGOUTPAGE_LOCATORS_PATH);
    }
    public void clickLogout(){
        String burgerMenuLocator = propertyParser.getPropertyValue(LogoutPageKey.BURGER_MENU_LOCATOR);
        String logoutLocator = propertyParser.getPropertyValue(LogoutPageKey.LOGOUT_OPTION_LOCATOR);
        Actions.clickElementByXpath(driver, burgerMenuLocator);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions.clickElementByXpath(driver, logoutLocator);
    }
}
