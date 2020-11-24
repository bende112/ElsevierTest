import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class MyStoreTest {


    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[]args){
        //the browser location is in the Utilities class
      System.setProperty("webdriver.chrome.driver", Utilities.CHROME_DRIVER_LOCATION);
        driver.get(Utilities.BASE_URL);
    Actions actions = new Actions(driver);
    WebElement menuOptionsWoman = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
        actions.moveToElement(menuOptionsWoman).perform();
    WebElement menuWoman = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]"));
    List<WebElement> anchorTags = menuWoman.findElements(By.tagName("a"));
        System.out.println("Number of tags" + anchorTags.size());

        for (WebElement subMenu : anchorTags) {
        if (subMenu.getText().equals("Summer Dresses")) {
            subMenu.click();
            break;
        }
    }

        MyStoreHomePage myStoreHomePage = new MyStoreHomePage(driver);
        myStoreHomePage.validatePageTitle();
        myStoreHomePage.validatePageTitle();

        //WebElement clickonDress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        WebElement add_to_cart = driver.findElement(By.linkText("Add to cart"));
        actions.moveToElement(add_to_cart);
        actions.click().build().perform();
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", add_to_cart);

        SummerDresses summerDresses = new SummerDresses(driver);
        summerDresses.clickAddToCartButton();



}

//    @Test(testName = "Check title")
//    public static void VerifyPageTitle(){
//        driver.get(Utilities.Url);
//        SummerDresses summerDresses = new SummerDresses(driver);
//        summerDresses.clickAddToCartButton();
//    }

    @Test
    public static void SelectSummerDress(){
        driver.get(Utilities.Url);
        Actions actions = new Actions(driver);
        WebElement clickonDress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
        actions.moveToElement(clickonDress);
        actions.click().build().perform();
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", clickonDress);

        SummerDresses summerDresses = new SummerDresses(driver);
        summerDresses.clickAddToCartButton();
    }

}




