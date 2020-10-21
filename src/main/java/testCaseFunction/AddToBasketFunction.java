package testCaseFunction;

import org.openqa.selenium.WebDriver;
import utils.BasePage;
import org.openqa.selenium.By;

public class AddToBasketFunction extends BasePage {
    private By addToBasket = By.cssSelector(".add-to-bs");
    private By goToBasket = By.cssSelector(".navigation-icon-basket");
    private By basketPrice = By.className("total-price");
    private By productPrice = By.className("prc-dsc");

    public AddToBasketFunction(WebDriver driver) {
        super(driver);
    }
    public void addToBasketProduct() throws InterruptedException {
        Thread.sleep(3500);
        element(addToBasket).click();
        Thread.sleep(1500);
        System.out.println(element(productPrice).getText() + " :  Ürün Detay Tutarı");
        Thread.sleep(2500);
        element(goToBasket).click();
        Thread.sleep(2500);
        System.out.println(element(basketPrice).getText()  + " :  Ürün Sepet Tutarı");
        Thread.sleep(1000);
        element(goToBasket).click();

    }
}
