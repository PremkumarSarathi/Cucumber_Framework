package stepDefinition;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckOutOverviewPage;


public class CheckOutOverviewSteps {

    public CheckOutOverviewPage checkOutOverviewPage;

    public CheckOutOverviewSteps(){
        checkOutOverviewPage = new CheckOutOverviewPage();
    }
    @When("^Adding total price of quantity$")
    public void adding_total_price_of_quantity(){
        checkOutOverviewPage.addPriceOfProduct();
    }

    @Then("^Validating total price of quantity$")
    public void validating_total_price_of_quantity(){
        checkOutOverviewPage.validateTotalPrice();
    }

    @When("^Click on Finish button$")
    public void click_on_finish_button(){
        checkOutOverviewPage.clickFinishButton();
    }

    @Then("^Validating user can navigate to checkout complete page$")
    public void validating_user_can_navigate_to_checkout_complete_page(){
        checkOutOverviewPage.validateCheckoutComplete();
    }
}
