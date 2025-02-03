package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utility.BrowserDriver;
import utility.ConfigReader;

import static pages.HomePage.*;

public class HomePageSteps extends BrowserDriver {

    @Given("I navigate to homepage")
    public void iNavigateTo() throws InterruptedException {
        BrowserDriver.getDriver(ConfigReader.getProperty("browser")).get(ConfigReader.getProperty("lcw_url"));
        Thread.sleep(2000);

        driver.manage().deleteAllCookies();
    }

    @When("Drag mouse cursor on the Giris Yap icon and click on the Giris Yap button")
    public void drag_mouse_cursor_and_click_element() throws InterruptedException {
        dragAndClickMouseCursor();
    }

    @And("I drag mouse on the {string} after {string} and click {string} from the submenu")
    public void go_To_Mont_Ve_Kaban_For_Girl_Child(String headerMenu,String headerTabMenu,String subMenu) throws InterruptedException {
        goToMontVeKabanForGirlChild(headerMenu,headerTabMenu,subMenu);
    }

    @When("I navigate to the Sepetim page")
    public void navigate_to_sepetim_page() throws InterruptedException {
        navigateToSepetimPage();
    }

    @When("I navigate to the Favorilerim page")
    public void navigate_to_favorilerim_page() throws InterruptedException {
        navigateToFavorilerimPage();
    }

    @And("Close the browser")
    public void close_browser() {
        BrowserDriver.closeDriver();
        BrowserDriver.quitDriver();
    }


}
