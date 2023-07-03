package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.YourCartPage;

public class YourCartSteps {

    public YourCartPage yourCartPage;

    public YourCartSteps(){
        yourCartPage = new YourCartPage();
    }

    @Then("^Validating selected products are present in the your cart page$")
    public void validating_selected_products_are_present_in_the_your_cart_page() {
        yourCartPage.validateSelectedProduct();
    }

    @When("^Click on checkout button$")
    public void click_on_checkout_button(){
        yourCartPage.clickCheckoutButton();
    }

    @Then("^User can navigate to user information page$")
    public void user_can_navigate_to_user_information_page(){
        yourCartPage.validateUserInformation();
    }
}
