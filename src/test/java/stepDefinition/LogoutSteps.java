package stepDefinition;

import io.cucumber.java.en.And;
import pageObject.LogoutPage;

public class LogoutSteps {

    public LogoutPage logoutPage;

    public LogoutSteps(){
        logoutPage = new LogoutPage();
    }

    @And("^Validating user can logout from the product page$")
    public void validating_user_can_logout_from_the_product_page(){
        logoutPage.clickLogout();
    }
}
