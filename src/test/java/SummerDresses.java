import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SummerDresses extends PageObject {

    WebElement addToCart = driver.findElement(By.linkText("Add to cart"));

    WebElement proceedToCheckout = driver.findElement(By.linkText("Proceed to checkout"));

//    @FindBy(how = How.LINK_TEXT, using ="Add to cart")
//    private WebElement AddtoCartButton;



  public void clickAddToCartButton(){
      addToCart.click();
  }

  public void clickProceedButton(){
      proceedToCheckout.click();
  }

    public SummerDresses(WebDriver driver) {
        super(driver);
    }
}
