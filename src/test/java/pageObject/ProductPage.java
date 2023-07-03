package pageObject;

import PageObjectKey.ProductPageKey;
import action.Actions;
import constant.FilePathConstant;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.WebTestBase;
import utilities.PropertyParser;

import java.util.Arrays;
import java.util.List;

public class ProductPage extends WebTestBase {
    public PropertyParser propertyParser;
    public ProductPage(){
       propertyParser = new PropertyParser(FilePathConstant.PRODUCTPAGE_LOCATORS_PATH) ;
    }

    public static String[] products = {"Sauce Labs Bolt T-Shirt", "Sauce Labs Onesie"};
    List product = Arrays.asList(products);

    public void sortProduct(String option){
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select  dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(option);
    }

    public void clickAddCartButton(){
        String totalProductNameLocators = propertyParser.getPropertyValue(ProductPageKey.TOTAL_PRODUCTNAME_LOCATOR);
        String addcartButtonLocator = propertyParser.getPropertyValue(ProductPageKey.ADDCART_BUTTON_LOCATOR);
        List<WebElement> totalProducts = driver.findElements(By.xpath(totalProductNameLocators));
        for(int i = 0; i< totalProducts.size();i++){
            String productName = totalProducts.get(i).getText();
           if(product.contains(productName)){
               List<WebElement> addCart = driver.findElements(By.cssSelector(addcartButtonLocator));
               addCart.get(i).click();
               System.out.println("Added to cart" +productName);
           }
        }
    }

    public void validateAddedproducts(){
        List<WebElement> removeButton = driver.findElements(By.xpath("//button[contains(text(),'Remove')]"));
        for (int i=0; i<removeButton.size();i++){
            String removeText = removeButton.get(i).getText();
            if(removeButton.contains(removeText)){
                List<WebElement> addedProductName = driver.findElements(By.xpath(""));
                String productName = addedProductName.get(i).getText();
                System.out.println("Added product list --- " +productName);
                System.out.println("Print the product status --- " +product.contains(productName));
            }
        }
    }

    public void clickAddCartLink(){
        String addcartLinkLocator = propertyParser.getPropertyValue(ProductPageKey.ADDCART_LINK_LOCATOR);
        Actions.clickElementByXpath(driver, addcartLinkLocator);
    }

    public void validateYourCartTitle(){
        String titleLocator = propertyParser.getPropertyValue(ProductPageKey.YOURCART_TITLE_LOCATOR);
        String title = driver.findElement(By.xpath(titleLocator)).getText();
        Assert.assertEquals(title, "Your Cart");
    }
}


