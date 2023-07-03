package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutCompletePage;

public class CheckoutCompleteSteps {

//    Then Validating order successful message
//    When Click on back home button
//    Then Validating user can navigate to product page

    public CheckoutCompletePage checkoutCompletePage;

    public CheckoutCompleteSteps(){
        checkoutCompletePage = new CheckoutCompletePage();
    }

    @Then("^Validating order successful message$")
    public void validating_order_successful_message(){
        checkoutCompletePage.validateSuccessfulMessage();
    }

    @When("^Click on back home button$")
    public void click_on_back_home_button(){
        checkoutCompletePage.clickBackHome();
    }

    @Then("^Validating user can navigate to product page$")
    public void validating_user_can_navigate_to_product_page(){
        checkoutCompletePage.validateHomePage();
    }
}
