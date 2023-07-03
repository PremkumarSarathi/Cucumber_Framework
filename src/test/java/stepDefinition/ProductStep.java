package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ProductPage;

public class ProductStep {

    public ProductPage productPage;

    public ProductStep(){
      productPage = new ProductPage();
    }

    @When("^Click the add cart button$")
    public void click_the_add_cart_button()  {
        productPage.clickAddCartButton();
    }

    @When("^Click on Add cart icon link$")
    public void click_the_add_cart_icon_link()  {
        productPage.clickAddCartLink();
    }

    @Then("^Validating the added products$")
    public void validating_the_added_products() {
        productPage.validateAddedproducts();
    }

    @Then("^Validating user can navigate to Your cart page$")
    public void validating_user_can_navigate_to_your_cart_page(){
        productPage.validateYourCartTitle();
    }


    @Then("Sorting the products {string} in the product page")
    public void sorting_the_products_in_the_product_page(String option){
        productPage.sortProduct(option);
    }

}
