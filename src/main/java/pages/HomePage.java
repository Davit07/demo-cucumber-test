package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;


public class HomePage {
    SelenideElement logInTitle = $("div.sw-contain-b-reg-in > div > span");
    SelenideElement emailField =  $("#login-name");
    SelenideElement passwordField = $("#password");
    SelenideElement logInButton = $("div:nth-child(4) > button");
    SelenideElement userName = $("p.home-wrapper-login");

    public void clickOnLogInTitle(){
        logInTitle.click();
    }
    public void typeInEmailField(String email){
        emailField.sendKeys(email);
    }
    public void typeInPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public HomePage clickOnLogInButton(){
        logInButton.click();
        return this;
    }

    public HomePage checkUserName(String text) {
        userName.shouldHave(Condition.text(text));
        return this;
    }
}
