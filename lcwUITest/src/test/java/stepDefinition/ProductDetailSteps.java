package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static pages.ProductDetailPage.*;


public class ProductDetailSteps {

    @And("I select an available size for the product")
    public static void select_product_size() throws InterruptedException {
        selectProductSize();
    }

    @When("I get the product name and color")
    public static void get_product_name_color_quantity() throws InterruptedException {
        getProductNameColorQuantity();
    }

    @And("I click the Sepete Ekle button")
    public static void click_basket() throws InterruptedException {
        clickBasket();
    }
}
