package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginSteps{

    public LoginPage loginPage;

    public LoginSteps(){
        loginPage = new LoginPage();
    }

    @Given("^User launch Application$")
    public void user_open_url() {
        loginPage.openUrl();
    }

    @And("User enter valid credentials {string} and {string}")
    public void user_enter_email_and_password(String email, String password) {
        loginPage.enterCredentials(email, password);
    }

    @And("^click on login$")
    public void click_on_login() {
        loginPage.clickLogin();
    }

    @Then("^Page title should be displayed$")
    public void page_title_should_be_displayed() {
        loginPage.validateProductPageTitle();
    }


}
