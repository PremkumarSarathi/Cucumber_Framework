package pageObject;

import PageObjectKey.CheckOutInformationPageKey;
import action.Actions;
import constant.FilePathConstant;
import org.junit.Assert;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

public class CheckOutInformationPage extends WebTestBase {

    public PropertyParser propertyParser;

    public CheckOutInformationPage(){
        propertyParser = new PropertyParser(FilePathConstant.CHECKOUTINFORMATION_LOCATORS_PATH);
    }

    public void enterFirstName(String firstName){
        String firstNameLocator = propertyParser.getPropertyValue(CheckOutInformationPageKey.FIRSTNAME_LOCATOR);
        Actions.enterText(driver, firstNameLocator, firstName);
    }

    public void enterLastName(String lastName){
        String lastNameLocator = propertyParser.getPropertyValue(CheckOutInformationPageKey.LASTNAME_LOCATOR);
        Actions.enterText(driver, lastNameLocator, lastName);
    }

    public void enterZIPCode(String ZIPCode){
        String zipcodeLocator = propertyParser.getPropertyValue(CheckOutInformationPageKey.ZIPCODE_LOCATOR);
        Actions.enterText(driver, zipcodeLocator, ZIPCode);
    }

    public void clickContinue(){
        String continueButtonLocator = propertyParser.getPropertyValue(CheckOutInformationPageKey.CONTINUE_BUTTON_LOCATOR);
        Actions.clickElementByXpath(driver, continueButtonLocator);
    }

    public void validateCheckoutTitle(){
        String titleLocator = propertyParser.getPropertyValue(CheckOutInformationPageKey.TITLE_LOCATOR);
        String title = Actions.getText(driver,titleLocator);
        Assert.assertEquals(title, "Checkout: Overview");
    }

}
