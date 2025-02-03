package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utility.BrowserDriver;


import static pages.ProductDetailPage.*;

public class BasketPage {

    //WebElements

    public static String product_basket_name_text = "//div[@class='rd-cart-item-main-info pl-15']/span[2]";
    public static String product_basket_color_text = "//div[@class='rd-cart-item-main-info pl-15']/div[2]/span[2]/strong";
    public static String product_basket_quantity_text = "//div[@class='rd-cart-item-main-info pl-15']/div[1]/div/input";
    public static String product_basket_price_text = "//*[@class='rd-cart-item-price mb-15']";
    public static String product_basket_total_price_text = "//*[@class='price-info-area']//*[contains(text(),'  GENEL TOPLAM')]/../span[2]";
    public static String add_favorite_button = "//*[@title='Favoriye Ekle']";

    //endElements

    public static String basketProductName = null;

    public static Actions actions = new Actions(BrowserDriver.driver);

    public static void verifyProductNameColorQuantityPrice() throws InterruptedException {

        basketProductName = BrowserDriver.driver.findElement(By.xpath(product_basket_name_text)).getText();
        String basketProductColor = BrowserDriver.driver.findElement(By.xpath(product_basket_color_text)).getText();
        String basketProductQuantity = BrowserDriver.driver.findElement(By.xpath(product_basket_quantity_text)).getAttribute("value");
        Assert.assertTrue(productName.contains(basketProductName));
        Assert.assertTrue(productColor.contains(basketProductColor));
        Assert.assertEquals("1", basketProductQuantity);
        Assert.assertEquals(BrowserDriver.driver.findElement(By.xpath(product_basket_price_text)).getText(), BrowserDriver.driver.findElement(By.xpath(product_basket_total_price_text)).getText());

        Thread.sleep(3000);
    }

    public static void clickHeartIcon() throws InterruptedException {

        actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(add_favorite_button))).perform();
        BrowserDriver.driver.findElement(By.xpath(add_favorite_button)).click();

        Thread.sleep(1000);
    }
}
