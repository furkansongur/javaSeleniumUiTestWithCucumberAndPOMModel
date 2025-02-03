package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static pages.GirlsOuterwearPage.*;

public class GirlsOuterwearSteps {

    @When("I select {string} for the Beden filter")
    public static void filter_girls_outerwear_size(String size) throws InterruptedException {
        filterGirlsOuterwearSize(size);
    }

    @And("I select {string} for the Renk filter")
    public static void filter_girls_outerwear_color(String color) throws InterruptedException {
        filterGirlsOuterwearColor(color);
    }

    @And("I click on the sorting dropdown and select {string}")
    public static void filter_girls_outerwear_sort(String sort) throws InterruptedException {
        filterGirlsOuterwearSort(sort);
    }

    @When("I click on the {string} product in the list")
    public static void filter_girls_outerwear_select_product(String sort) throws InterruptedException {
        filterGirlsOuterwearSelectProduct(sort);
    }
}
