package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;
public class GrowAndDroppingBasketFunction extends BasePage  {

    private By growUp = By.cssSelector(".ty-numeric-counter .ty-numeric-counter-button:last-child");
    private By drop   = By.cssSelector(".ty-numeric-counter .ty-numeric-counter-button:first-child");
    private By deleteItem = By.className("i-trash");
    private By confirmDelete = By.cssSelector(".content-body .footer .btn-box-remove-item .btn-remove");
    private By countBasketItem = By.className("counter-content");
    public GrowAndDroppingBasketFunction(WebDriver driver) {
        super(driver);
    }
    public void growAndDropItem() throws InterruptedException {
        System.out.println(" Sepetinizdeki Ürün Sayısı : " +element(countBasketItem).getAttribute("value"));
        Thread.sleep(1000);
        element(growUp).click();
        Thread.sleep(2500);
        System.out.println(" Sepetinizdeki Ürün Sayısı : " +element(countBasketItem).getAttribute("value"));
        element(drop).click();
        Thread.sleep(1500);
        element(deleteItem).click();
        Thread.sleep(1000);
        element(confirmDelete).click();

    }
}
