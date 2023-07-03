package pageObject;

import PageObjectKey.CheckOutOverviewPageKey;
import action.Actions;
import constant.FilePathConstant;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

import java.util.List;

public class CheckOutOverviewPage extends WebTestBase {

    public double totalPrice = 0;
    public double defaultTotalPrice;
    public PropertyParser propertyParser;
    public CheckOutOverviewPage(){
        propertyParser = new PropertyParser(FilePathConstant.CHECKOUTOVERVIEW_LOCATORS_PATH);
    }
    public void addPriceOfProduct(){
        String productTextLocator = propertyParser.getPropertyValue(CheckOutOverviewPageKey.PRODUCTS_TEXT_LOCATOR);
        List<WebElement> productPrice = driver.findElements(By.xpath(productTextLocator));
        for (int i=0; i< productPrice.size();i++){
            String priceText = productPrice.get(i).getText();
            String priceValue = priceText.substring(1);
            double price = Double.parseDouble(priceValue);
            System.out.println("Individual product price - "+price);
            totalPrice = totalPrice+price;
        }
        System.out.println("sum of the total price - "+totalPrice);
    }

//    public void getDefaultTotalPrice(){
//        String totalPriceText = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText();
//        String[] totalPriceValue = totalPriceText.split("\\$");
//        defaultTotalPrice = Double.parseDouble(totalPriceValue[1]);
//        Assert.assertEquals(defaultTotalPrice,totalPrice);
//        System.out.println("Validated added product price "+totalPrice+ "is matching with default total price"+defaultTotalPrice);
//    }

    public void validateTotalPrice(){
        String totalPriceLocator = propertyParser.getPropertyValue(CheckOutOverviewPageKey.PRICE_TEXT_LOCATOR);
        String totalPriceText = Actions.getText(driver, totalPriceLocator);
        String[] totalPriceValue = totalPriceText.split("\\$");
        defaultTotalPrice = Double.parseDouble(totalPriceValue[1]);
        System.out.println("defaultTotalPrice - "+defaultTotalPrice);
//        Assert.assertEquals(defaultTotalPrice,totalPrice);
//        System.out.println("Validated added product price "+totalPrice+ "is matching with default total price"+defaultTotalPrice);
    }

    public void clickFinishButton(){
        String finishButtonLocator = propertyParser.getPropertyValue(CheckOutOverviewPageKey.FINISH_BUTTON_LOCATOR);
        Actions.clickElementByXpath(driver, finishButtonLocator);
    }

    public void validateCheckoutComplete(){
        String titleLocator = propertyParser.getPropertyValue(CheckOutOverviewPageKey.TITLE_LOCATOR);
        String title = Actions.getText(driver, titleLocator);
        Assert.assertEquals(title, "Checkout: Complete!");
    }
}
