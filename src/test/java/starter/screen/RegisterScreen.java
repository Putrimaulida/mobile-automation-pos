package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject{
    // ========== Locator @TC01-Register ==========
    private By clickWidget() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By registerFeature() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By fullNameFiled() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By emailFiled() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By passwordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    private By registerButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By productPage() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    // ========== Locator @TC02-Register ==========
    private By newFullName() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By errorRegister() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
    }



    // ========== @TC01-Register ==========
    @Step
    public void clickWidgetIcon() {
        onClick(clickWidget());
    }
    @Step
    public void registerClick() {
        onClick(registerFeature());
    }
    @Step
    public void inputFullName(String fullName) {
        onClick(fullNameFiled());
        clear(fullNameFiled());
        onType(fullNameFiled(), fullName);
    }
    @Step
    public void inputEmail(String email) {
        onClick(emailFiled());
        clear(emailFiled());
        onType(emailFiled(), email);
    }
    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        clear(passwordField());
        onType(passwordField(), password);
    }
    @Step
    public void clickRegisterBtn() {
        onClick(registerButton());
    }
    @Step
    public void onProductPage() {
        waitUntilVisible(productPage()).isDisplayed();
    }

    // ========== @TC02-Register ==========
    @Step
    public void newFullNameField(String newName) {
        onClick(newFullName());
        clear(newFullName());
        onType(newFullName(), newName);
    }
    @Step
    public String errorMessage() {
        return waitUntilVisible(errorRegister()).getText();
    }
}
