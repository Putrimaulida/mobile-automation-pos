package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    //====================== Locator ====================
    private By onLoginPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");
    }
    private By nextBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    }
    static By idLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc='Cashier ID']/following-sibling::android.widget.ImageView");
    }
    static By passwordLogin() {
        return AppiumBy.xpath("//android.view.View[@content-desc='Password']/following-sibling::android.widget.EditText");
    }
    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    private By orderSushi() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]");
    }

    private By invalidLogin() {
        return AppiumBy.xpath("(//android.view.View[@content-desc=\"The field cannot be empty\"])[1]");
    }


    // ================== Functional ==================

    // @PositiveLogin
    @Step
    public void onOnboardingPage() {
        onClick(nextBtn());
    }

    @Step
    public void clickFirstNextButton() {
        onClick(nextBtn());
    }
    @Step
    public void inputId(String idCashier) {
        onClick(idLogin());
        onType(idLogin(), idCashier);
    }

    @Step
    public void inputPassword(String passwordLogin) {
        onClick(passwordLogin());
        onClick(passwordLogin());
        onType(passwordLogin(), passwordLogin);
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }

    @Step
    public void successfullyLoginAndEnteredTheSushiOrderPage() {
        onClick(orderSushi());
    }

    // Invalid ID
    @Step
    public void cashierStillOnTheLoginPage() {
        onClick(onLoginPage());
    }

    @Step
    public String cashierSeeErrorMessage() {
        return waitUntilVisible(invalidLogin()).getText();
    }
}
