package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class LoginByStepdefs {
    HomePage homePage = new HomePage();
    String userName = "tpmtest1";
    String userPassword = "Test#123";

    @Given("Open staging site")
    public void openStagingSite() {
    }

    @When("Click on the login title")
    public void clickOnTheLoginTitle() {
        homePage.clickOnLogInTitle();
    }

    @When("Enter user valid email in email field")
    public void enterUserValidInEmailField() {
        homePage.typeInEmailField(userName);
    }

    @When("Enter user valid password in password field")
    public void enterUserValidPasswordInField() {
        homePage.typeInPasswordField(userPassword);
    }

    @When("Click on login button")
    public void clickOnLoginButton() {
        homePage.clickOnLogInButton();
    }

    @Then("User name is: {string}")
    public void userNameIs(String arg0) {
        homePage.checkUserName(arg0);
    }
}
