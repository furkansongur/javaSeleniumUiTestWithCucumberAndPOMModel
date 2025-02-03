package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import utility.BrowserDriver;

import java.time.Duration;


public class HomePage {

    //WebElements
    @FindBy(id = "user_1_")
    public static WebElement login_icon;

    @FindBy(className = "cart-action__btncart-action__btn--bg-blue")
    public static WebElement login_button;

    public static String header_items= "//*[@class='menu-nav__lists']/li";
    public static String tab_header = "//div[@class='mega-menu mega-menu--hovered']//ul[@class='nav-tab__tab-list ']/button";
    public static String sub_menu = "//div[@class='mega-menu mega-menu--hovered']//ul[@class='nav-tab__tab-list ']/../section/div/div[2]/ul/li";
    public static String basket_button = "//*[@href='https://www.lcw.com/sepetim' and @class='header-dropdown-toggle']";
    public static String favorites_button = "//*[@href='/favorilerim']";

    //endElements


    public static Actions actions = new Actions(BrowserDriver.driver);

    public static void dragAndClickMouseCursor() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(BrowserDriver.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cookieseal-banner-reject']")));

        BrowserDriver.driver.findElement(By.xpath("//*[@id='cookieseal-banner-reject']")).click();

        actions.moveToElement(login_icon).perform();

        Thread.sleep(2000);

        login_button.click();

    }

    public static void goToMontVeKabanForGirlChild(String headerMenu,String headerTabMenu,String subMenu) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(header_items)));

        for (int i = 1; i <= BrowserDriver.driver.findElements(By.xpath(header_items)).size(); i++) {
            if (BrowserDriver.driver.findElement(By.xpath(header_items + "[" + i + "]")).getText().equals(headerMenu)) {
                actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(header_items + "[" + i + "]"))).perform();
                break;
            }
        }

        Thread.sleep(2000);

        for (int i = 1; i <= BrowserDriver.driver.findElements(By.xpath(tab_header)).size(); i++) {
            if (BrowserDriver.driver.findElement(By.xpath(tab_header + "[" + i + "]")).getText().contains(headerTabMenu)) {
                actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(tab_header + "[" + i + "]"))).perform();
                break;
            }
        }

        Thread.sleep(2000);

        for (int i = 1; i <= BrowserDriver.driver.findElements(By.xpath(sub_menu)).size(); i++) {
            if (BrowserDriver.driver.findElement(By.xpath(sub_menu + "[" + i + "]")).getText().equals(subMenu)) {
                actions.moveToElement(BrowserDriver.driver.findElement(By.xpath(sub_menu + "[" + i + "]"))).click().perform();
                break;
            }
        }
    }

    public static void navigateToSepetimPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(basket_button)));

        BrowserDriver.driver.findElement(By.xpath(basket_button)).click();

        Thread.sleep(4000);
    }

    public static void navigateToFavorilerimPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(favorites_button)));

        BrowserDriver.driver.findElement(By.xpath(favorites_button)).click();

        Thread.sleep(4000);
    }
}
