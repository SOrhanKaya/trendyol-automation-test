package testCase;
import listener.Listener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testCaseFunction.*;
import utils.BaseTest;
@Listeners({Listener.class})
public class TrendyolAutomation extends BaseTest{


    @Test(priority = 0)
    public void login() throws InterruptedException {
        LoginFunction login = new LoginFunction(driver);
        login.Login();
        log.info("Başarıyla Giriş Yapıldı");
        Thread.sleep(5000);
    }
    @Test(priority = 1)
    public void Search() throws InterruptedException {
        SearchFunction search = new SearchFunction(driver);
        search.Search();
        log.info("Bilgisayar Araması yapıldı");
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    public void addToBasket() throws InterruptedException {
        AddToBasketFunction addToBasket = new AddToBasketFunction(driver);
        addToBasket.addToBasketProduct();

        log.info("Ürün Sepete Eklendi");
        log.info("Ürün Fiyatı Karşılaştırıldı");
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    public void growAndDrop() throws InterruptedException {
        GrowAndDroppingBasketFunction growAndDropping = new GrowAndDroppingBasketFunction(driver);
        growAndDropping.growAndDropItem();

        log.info("Sepetteki ürün sayısı artırıldı ve Sonrasında Silindi");
        Thread.sleep(5000);

        driver.quit();
    }

}
