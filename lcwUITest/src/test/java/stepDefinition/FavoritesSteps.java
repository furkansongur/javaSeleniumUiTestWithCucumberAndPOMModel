package stepDefinition;

import io.cucumber.java.en.And;

import static pages.FavoritesPage.*;


public class FavoritesSteps {

    @And("I verify the previously favorited product is listed using its name")
    public void verify_favorited_product() throws InterruptedException {
        verifyFavoritedProduct();
    }
}
