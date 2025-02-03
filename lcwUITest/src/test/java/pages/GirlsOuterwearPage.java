package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class GirlsOuterwearPage {

    //WebElements

    public static String filter_size = "//div[@class='collapsible-filter-container__content-area collapsible-filter-container__content-area--size-filter']/div";
    public static String filter_color = "//div[@class='collapsible-filter-container__content-area collapsible-filter-container__content-area--color-filter']/div";
    public static String sort_button = "//*[@class='dropdown-button desktop-list-options-bar__sort-select-button']/button";
    public static String sort_drop_menu = "//*[@class='dropdown-button__dropdown dropdown-button__dropdown--open']/a";
    public static String product_list = "//*[@class='product-grid']/div";

    //endElements

    public static Actions actions = new Actions(BrowserDriver.driver);

    public static WebDriverWait wait = new WebDriverWait(BrowserDriver.driver, Duration.ofSeconds(10));

    public static void filterGirlsOuterwearSize(String size) throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(filter_size)));

        for (int i = 1; i <= BrowserDriver.driver.findElements(By.xpath(filter_size)).size(); i++) {
            String sizeText = BrowserDriver.driver.findElement(By.xpath(filter_size + "[" + i + "]")).getText().split("\n")[0];
            if (sizeText.equals(size)) {
                actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(filter_size + "[" + i + "]"))).perform();
                BrowserDriver.driver.findElement(By.xpath(filter_size + "[" + i + "]")).click();
                break;
            }
        }

        Thread.sleep(4000);

    }

    public static void filterGirlsOuterwearColor(String color) throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(filter_color)));

        for (int i = 1; i <= BrowserDriver.driver.findElements(By.xpath(filter_color)).size(); i++) {
            String colorText = BrowserDriver.driver.findElement(By.xpath(filter_color + "[" + i + "]")).getText().split("\n")[0];
            if (colorText.equals(color)) {
                actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(filter_color + "[" + i + "]"))).perform();
                BrowserDriver.driver.findElement(By.xpath(filter_color + "[" + i + "]")).click();
                break;
            }
        }

        Thread.sleep(4000);
    }

    public static void filterGirlsOuterwearSort(String sort) throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sort_button)));

        actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(sort_button))).perform();

        Thread.sleep(1000);

        actions.sendKeys(Keys.PAGE_UP).perform();

        Thread.sleep(1000);

        BrowserDriver.driver.findElement(By.xpath(sort_button)).click();

        Thread.sleep(2000);

        for (int i = 1; i <= BrowserDriver.driver.findElements(By.xpath(sort_drop_menu)).size(); i++) {
            String sortText = BrowserDriver.driver.findElement(By.xpath(sort_drop_menu + "[" + i + "]")).getText().split("\n")[0];
            if (sortText.equals(sort)) {
                actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(sort_drop_menu + "[" + i + "]"))).perform();
                BrowserDriver.driver.findElement(By.xpath(sort_drop_menu + "[" + i + "]")).click();
                break;
            }
        }

        Thread.sleep(3000);
    }

    public static void filterGirlsOuterwearSelectProduct(String sort) throws InterruptedException {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(product_list)));

        actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(product_list + "[" + sort + "]"))).perform();
        BrowserDriver.driver.findElement(By.xpath(product_list + "[" + sort + "]")).click();

        Thread.sleep(3000);
    }
}
