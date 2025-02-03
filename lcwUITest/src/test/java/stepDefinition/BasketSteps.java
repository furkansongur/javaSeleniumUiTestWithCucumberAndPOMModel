package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.BasketPage.*;

public class BasketSteps {

    @Then("I verify the product name, color, quantity and price are correct")
    public void verify_product_name_color_quantity_price() throws InterruptedException {
        verifyProductNameColorQuantityPrice();
    }

    @When("I click on the heart icon on the product card to add it to favorites")
    public void click_heart_icon() throws InterruptedException {
        clickHeartIcon();
    }
}
