package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen register;
    // ========== @TC01-Register ==========
    @Given("user on the products page")
    public void userOnTheProductsPage() {
        register.onProductPage();
    }
    @When("user click widget button")
    public void userClickWidgetButton() {
        register.clickWidgetIcon();
    }
    @And("user click register")
    public void userClickRegister() {
        register.registerClick();
    }
    @And("user input full name")
    public void userInputFullName() {
        register.inputFullName("Putri Maulida Sito Resmi");
    }
    @And("user input valid email")
    public void userInputValidEmail() {
        register.inputEmail("putrimaulidasr@gmail.com");
    }
    @And("user input password")
    public void userInputPassword() {
        register.inputPassword("putri25");
    }
    @And("user click register button")
    public void userClickRegisterButton() {
        register.clickRegisterBtn();
    }

    // ========== @TC02-Register ==========
    @And("user input new full name")
    public void userInputNewFullName() {
        register.newFullNameField("Tiara Andini");
    }
    @Then("user see error message {string}")
    public void userSeeErrorMessage(String message) {
        Assert.assertEquals(message, register.errorMessage());
    }


}
