package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;
import utility.ConfigReader;

public class LoginPage {

    public static String email_text_box = "//input[@name='emailAndPhone']";
    public static String devam_et_button = "//button[@class='login-form__button login-form__button--bg-blue']";
    public static String pw_text_box = "//input[@name='password']";


    public static void loginWithValidEmail() {
        BrowserDriver.driver.findElement(By.xpath(email_text_box)).sendKeys(ConfigReader.getProperty("email"));

        BrowserDriver.driver.findElement(By.xpath(devam_et_button)).click();

    }

    public static void loginWithValidPassword() throws InterruptedException {

        BrowserDriver.driver.findElement(By.xpath(pw_text_box)).sendKeys(ConfigReader.getProperty("password"));

        BrowserDriver.driver.findElement(By.xpath(devam_et_button)).click();

        Thread.sleep(2000);

        BrowserDriver.getDriver("chrome").get("https://www.lcw.com/");

    }
}
