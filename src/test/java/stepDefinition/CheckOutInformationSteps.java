package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckOutInformationPage;

public class CheckOutInformationSteps {

    public CheckOutInformationPage checkOutInformationPage;

    public CheckOutInformationSteps(){
        checkOutInformationPage = new CheckOutInformationPage();
    }

    @When("Enter the user first name {string}")
    public void enter_the_user_first_name(String firstname) {
        checkOutInformationPage.enterFirstName(firstname);
    }

    @When("Enter the user last name {string}")
    public void enter_the_user_last_name(String lastname) {
        checkOutInformationPage.enterLastName(lastname);
    }

    @When("Enter the user zip code {string}")
    public void enter_the_user_zip_code(String zipcode) {
        checkOutInformationPage.enterZIPCode(zipcode);
    }

    @Then("^click the continue button$")
    public void click_the_continue_button() {
       checkOutInformationPage.clickContinue();
    }

    @And("^Validating user can navigate to checkout overview page$")
    public void validating_user_can_navigate_to_checkout_overview_page() {
       checkOutInformationPage.validateCheckoutTitle();
    }

}
