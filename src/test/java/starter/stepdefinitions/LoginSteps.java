package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen login;
    @And("user click login button")
    public void userClickLoginButton() {
        login.clickLoginBtn();
    }
}
