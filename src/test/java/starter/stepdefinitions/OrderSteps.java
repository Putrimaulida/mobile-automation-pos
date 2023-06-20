package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginScreen;
import starter.screen.OrderScreen;

public class OrderSteps {
    @Steps
    OrderScreen order;
    @And("cashier input customer's name {string}")
    public void cashierInputCustomerSName(String customerName) {
        order.cashierInputCustomerSName(customerName);
    }

    @And("cashier select service Dine In")
    public void cashierSelectServiceDineIn() {
        order.cashierSelectServiceDineIn();
    }

    @And("cashier input number of table {string}")
    public void cashierInputNumberOfTable(String tableNumber) {
        order.cashierInputNumberOfTable(tableNumber);
    }

    @And("cashier click Create New Order button")
    public void cashierClickCreateNewOrderButton() {
        order.cashierClickCreateNewOrderButton();
    }

    @Then("the app successfully display the menu")
    public void theAppSuccessfullyDisplayTheMenu() {
        order.theAppSuccessfullyDisplayTheMenu();
    }
}
