import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyStoreHomePage extends PageObject {

    @FindBy(xpath = "//img[contains(@class,'img-responsive')]")
    WebElement YourLogo;

    public void validatePageTitle() {
        YourLogo.isDisplayed();
    }

    public boolean  validateImage(){
        return YourLogo.isDisplayed();
    }

    public MyStoreHomePage(WebDriver driver) {
        super(driver);
    }
}