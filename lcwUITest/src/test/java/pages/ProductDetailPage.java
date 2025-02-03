package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utility.BrowserDriver.*;

public class ProductDetailPage {
    //WebElements

    public static String available_product_size = "//div[@class='option-size-boxes-desktop']/button[@class='option-box option-size-box option-size-box__stripped'][1]";
    public static String basket_button = "//button[@class='add-to-card']";
    public static String product_name = "//h1[@class='product-title']";
    public static String product_color = "//div[@class='product-code']//span/..";

    //endElements

    public static String productName = null;
    public static String productColor = null;

    public static Actions actions = new Actions(driver);

    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public static void selectProductSize() throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(available_product_size)));

        actions.click();
        actions.moveToElement(driver.findElement(By.xpath(available_product_size))).perform();
        driver.findElement(By.xpath(available_product_size)).click();

        Thread.sleep(3000);
    }

    public static void getProductNameColorQuantity() throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(product_name)));

        productName = driver.findElement(By.xpath(product_name)).getText();
        productColor = driver.findElement(By.xpath(product_color)).getText();

        Thread.sleep(3000);
    }

    public static void clickBasket() throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(basket_button)));

        actions.moveToElement(driver.findElement(By.xpath(basket_button))).perform();
        driver.findElement(By.xpath(basket_button)).click();

        Thread.sleep(3000);
    }


}
