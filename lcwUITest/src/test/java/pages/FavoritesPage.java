package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import utility.BrowserDriver;


import static pages.BasketPage.*;

public class FavoritesPage {

    //WebElements

    public static String favorites_productName = "//*[@class='product-card__title']";

    //endElemens

    public static void verifyFavoritedProduct() throws InterruptedException {

        String favoritesProductName = BrowserDriver.driver.findElement(By.xpath(favorites_productName)).getText();

        Assert.assertTrue(favoritesProductName.contains(basketProductName));
    }
}
