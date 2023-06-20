package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.automation.pageobject.BasePageObject;

import java.time.Duration;

public class OrderScreen extends BasePageObject {

    private By customerField() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Customer's Name\"]/following-sibling::android.widget.EditText)[1]");
    }
    private By orderOptionDineIn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Dine In\"]");
    }
    private By orderOptionTakeAway() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Take Away\"]");
    }
    private By tableNum() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"Customer's Name\"]/following-sibling::android.widget.EditText)[2]");
    }
    private By createNewOrderBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Create New Order\"]");
    }
    private By menuPage() {
        return AppiumBy.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView");
    }


    //============== Functional ==================

    @Step
    public void cashierInputCustomerSName(String customerName) {
        onClick(customerField());
        onType(customerField(), customerName);
    }

    @Step
    public void cashierSelectServiceDineIn() {
        onClick(orderOptionDineIn());
    }

    @Step
    public void cashierInputNumberOfTable(String numberTable) {
        onClick(tableNum());
        onType(tableNum(), numberTable);
    }

    @Step
    public void cashierClickCreateNewOrderButton() {
        onClick(createNewOrderBtn());
    }

    @Step
    public boolean theAppSuccessfullyDisplayTheMenu() {
        return waitUntilVisible(menuPage()).isDisplayed();
    }
}
