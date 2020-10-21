package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class LoginFunction extends BasePage {


    String email = "orhan-test-selenium@outlook.com";
    String password = "o123456";
    private By closeFancy = By.cssSelector(".fancybox-close");
    private By signin = By.cssSelector(".user-navigation-container ul li .nav-span, .user-navigation-container ul li span");
    private By loginmail = By.id("login-email");
    private By loginpass = By.id("login-password-input");
    private By loginButton = By.cssSelector(".q-button.q-fluid");

    public LoginFunction(WebDriver driver) {
        super(driver);
    }

    public void Login() throws InterruptedException {
        String baseUrl = "https://www.trendyol.com/";
        driver.get(baseUrl);
        element(closeFancy).click();
        Thread.sleep(2000);
        element(signin).click();
        Thread.sleep(2000);
        element(loginmail).sendKeys(email);
        Thread.sleep(2000);
        element(loginpass).sendKeys(password);
        Thread.sleep(2000);
        element(loginButton).click();

    }

}
