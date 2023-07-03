package pageObject;

import PageObjectKey.YourCartPageKey;
import action.Actions;
import constant.FilePathConstant;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

import java.util.Arrays;
import java.util.List;

public class YourCartPage extends WebTestBase {

    public PropertyParser propertyParser;

    public YourCartPage(){
        propertyParser = new PropertyParser(FilePathConstant.YOURCARTPAGE_LOCATORS_PATH);
    }

    List selectedProduct = Arrays.asList(ProductPage.products);

    public void validateSelectedProduct(){
        String productNameLocator = propertyParser.getPropertyValue(YourCartPageKey.SELECTED_PRODUCTNAME_LOCATOR);
        List<WebElement> totalProduct = driver.findElements(By.cssSelector(productNameLocator));
        for(int i=0; i<totalProduct.size();i++){
            String yourcartProductName = totalProduct.get(i).getText();
            System.out.println("Selected product are present in yourcart page" +yourcartProductName+
                    " --- " +selectedProduct.contains(yourcartProductName));
        }
    }

    public void clickCheckoutButton(){
        String checkoutButtonLocator = propertyParser.getPropertyValue(YourCartPageKey.CHECKOUT_BUTTON_LOCATOR);
        Actions.clickElementByXpath(driver, checkoutButtonLocator);
    }

    public void validateUserInformation(){
        String titleLocator = propertyParser.getPropertyValue(YourCartPageKey.TITLE_LOCATOR);
        String title = driver.findElement(By.xpath(titleLocator)).getText();
        Assert.assertEquals(title, "Checkout: Your Information");
    }
}
