package pageObject;

import PageObjectKey.CheckOutCompletePageKey;
import action.Actions;
import constant.FilePathConstant;
import org.junit.Assert;
import org.openqa.selenium.By;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

public class CheckoutCompletePage extends WebTestBase {
    public PropertyParser propertyParser;
    public CheckoutCompletePage(){
        propertyParser = new PropertyParser(FilePathConstant.CHECKOUTCOMPLETE_LOCATORS_PATH);
    }
    public void validateSuccessfulMessage(){
        String successMessageLocator = propertyParser.getPropertyValue(CheckOutCompletePageKey.SUCCESS_MESSAGE_LOCATOR);
        String message = Actions.getText(driver, successMessageLocator);
        Assert.assertEquals(message, "Thank you for your order!");
    }

    public void clickBackHome(){
        String backHomeLocator = propertyParser.getPropertyValue(CheckOutCompletePageKey.BACK_HOME_LOCATOR);
        Actions.clickElementByXpath(driver, backHomeLocator);
    }

    public void validateHomePage(){
        String titleLocator = propertyParser.getPropertyValue(CheckOutCompletePageKey.TITLE_LOCATOR);
        String title = Actions.getText(driver, titleLocator);
        Assert.assertEquals(title, "Products");
    }
}
