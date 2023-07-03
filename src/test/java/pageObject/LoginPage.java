package pageObject;

import PageObjectKey.LoginPageKey;
import action.Actions;
import constant.FilePathConstant;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

public class LoginPage extends WebTestBase {

    public PropertyParser loginLocator;

    public LoginPage(){
        loginLocator = new PropertyParser(FilePathConstant.LOGIN_LOCATORS_PATH);
    }
    public void openUrl(){
        driver.get("https://www.saucedemo.com/");
        LOGGER.info("***Launch the swaglabs application***");
    }

    public void enterCredentials(String email, String password){
        String usernameLocator = loginLocator.getPropertyValue(LoginPageKey.USERNAME_LOCATOR);
        String passwordLocator = loginLocator.getPropertyValue(LoginPageKey.PASSWORD_LOCATOR);
        Actions.enterText(driver, usernameLocator, email);
        LOGGER.info("***Enter the email***");
        Actions.enterText(driver, passwordLocator, password);
        LOGGER.info("***Enter the password***");
    }

    public void clickLogin(){
        String loginButtonLocator = loginLocator.getPropertyValue(LoginPageKey.LOGIN_BUTTON_LOCATOR);
        Actions.clickElementByXpath(driver, loginButtonLocator);
        LOGGER.info("***Click the login button***");
    }

    public void validateProductPageTitle(){
        String pageTitelLocator = loginLocator.getPropertyValue(LoginPageKey.PRODUCT_TITLE);
        try {
            boolean status = Actions.elementVisible(driver, pageTitelLocator);
            Assert.assertEquals(true, status);
            LOGGER.info("***Title is visible***");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", "");
        }
        catch (AssertionError e){
            System.out.println(e);
        }
    }

}
