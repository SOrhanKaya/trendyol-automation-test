package testCaseFunction;
import org.openqa.selenium.WebDriver;
import utils.BasePage;
import org.openqa.selenium.By;

public class SearchFunction extends BasePage {
    String searchParameter = "bilgisayar";
    private By searchQuery = By.cssSelector(".search-box-container .search-box");
    private By getSearch = By.cssSelector(".search-icon");
    private  By selectModel = By.partialLinkText("Hometech");
    private By selectProduct = By.partialLinkText("Alfa 800c N3350 4gb");




    public SearchFunction(WebDriver driver) {
        super(driver);
    }
    public void Search() throws InterruptedException {
        element(searchQuery).sendKeys(searchParameter);
        Thread.sleep(1500);
        element(getSearch).click();
        Thread.sleep(7500);
        element(selectModel).click();
        Thread.sleep(2500);
        element(selectProduct).click();

    }

}
